package HaTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HuffmanTree {
    private HNode[] data; // 结点数组
    private int leafNum; // 叶子结点数目

    // 构造哈夫曼树
    public void create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要传输的报文:");
        String str = sc.nextLine().toLowerCase();
        str = str.replace(" ", "");
        int[] c = new int[26];
        for (int i = 0; i < str.length(); i++) {
            c[str.charAt(i) - 'a']++;
        }
        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            if (c[i] > 0)
                cnt++;
        }
        this.leafNum = cnt;

        data = new HNode[this.leafNum * 2 - 1];
        for (int i = 0; i < 2 * leafNum - 1; i++)
            data[i] = new HNode();

        cnt = 0;
        for (int i = 0; i < 26; i++) {
            if (c[i] > 0) {
                data[cnt].setName((char) (i + 'a') + "");
                data[cnt++].setWeight(c[i]);
            }
        }
        int m1, m2, x1, x2;
        for (int i = 0; i < this.leafNum - 1; ++i) {
            m1 = m2 = Integer.MAX_VALUE;
            x1 = x2 = 0;
            for (int j = 0; j < this.leafNum + i; ++j) {
                if ((data[j].getWeight() < m1) && (data[j].getParent() == -1)) {
                    m2 = m1;
                    x2 = x1;
                    m1 = data[j].getWeight();
                    x1 = j;
                } else if ((data[j].getWeight() < m2)
                        && (data[j].getParent() == -1)) {
                    m2 = data[j].getWeight();
                    x2 = j;
                }
            }
            data[this.leafNum + i].setWeight(data[x1].getWeight()
                    + data[x2].getWeight());
            data[this.leafNum + i].setLchild(x1);
            data[this.leafNum + i].setRchild(x2);
            // 修改权值最小的两个结点的父结点指向
            data[x1].setParent(this.leafNum + i);
            data[x2].setParent(this.leafNum + i);
        }
    }

    //输出哈夫曼树结构
    public void print() {
        System.out.println("位置\t字符\t权值\t父结点\t左孩子结点\t右孩子结点");
        for (int i = 0; i < 2 * leafNum - 1; i++) {
            System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\r\n", i,
                    data[i].getName(), data[i].getWeight(),
                    data[i].getParent(), data[i].getLchild(),
                    data[i].getRchild());
        }
    }


    // 前序遍历,输出所有叶子结点的编码,并计算总的报文编码长度
    private int preorder(HNode root, String code) {
        int sum = 0;
        if (root != null) {
            root.setCode(code);
            if (isLeaf(root)) {        //叶子结点，输出编码，并计算长度
                System.out.println(root.getName() + ":" + root.getCode());
                return root.getWeight() * root.getCode().length();
            }

            if (root.getLchild() != -1) {
                //左子树，编码为0，并统计左子树叶子结点的编码长度
                sum += preorder(data[root.getLchild()], code + "0");
            }
            if (root.getRchild() != -1) {
                //右子树，编码为1，并统计右子树所有叶子结点的编码长度
                sum += preorder(data[root.getRchild()], code + "1");
            }
        }
        return sum;
    }

    //层序遍历，求报文传输的总长度
    private void levelOrder() {
        //根结点的位置
        int root = 2 * leafNum - 2;
        // 根结点为空
        if (root == -1) {
            return;
        }
        // 设置一个队列保存层序遍历的结点
        Queue<HNode> q = new LinkedList<HNode>();
        // 根结点入队
        q.add(data[root]);
        int sum = 0;
        String code = "";
        // 队列非空，结点没有处理完
        while (!q.isEmpty()) {
            // 结点出队
            HNode tmp = q.poll();
            code = tmp.getCode();
            // 如果是叶子结点，则计算编码长度
            if (isLeaf(tmp)) {
                sum += tmp.getWeight() * tmp.getCode().length();
            }
            // 将当前结点的左孩子结点入队
            if (tmp.getLchild() != -1) {
                q.add(data[tmp.getLchild()]);
                data[tmp.getLchild()].setCode(code + "0");
            }
            if (tmp.getRchild() != -1) {
                // 将当前结点的右孩子结点入队
                q.add(data[tmp.getRchild()]);
                data[tmp.getRchild()].setCode(code + "1");
            }
        }
        System.out.println("总的报文长度为：" + sum);
    }

    //采用层序遍历，进行报文解码
    public String decodes(String codes) {
        //根结点的位置
        int root = 2 * leafNum - 2;
        // 根结点为空
        if (root == -1) {
            return "";
        }
        // 设置一个队列保存层序遍历的结点
        Queue<HNode> q = new LinkedList<HNode>();
        // 根结点入队
        q.add(data[root]);
        int i = 0;
        String str = "";
        // 队列非空，结点没有处理完
        while (!q.isEmpty()) {
            // 结点出队
            HNode tmp = q.poll();
            if (!codes.startsWith(tmp.getCode())) continue;
            // 如果是叶子结点，则计算编码长度
            if (isLeaf(tmp)) {
                str = str + tmp.getName();
                codes = codes.substring(tmp.getCode().length());
                if (codes.length() > 0) { //如果存在多个报文字符，则继续重新解码
                    while (!q.isEmpty()) q.poll();
                    q.add(data[root]);
                    continue;
                }
            }
            // 将当前结点的左孩子结点入队
            if (tmp.getLchild() != -1) {
                q.add(data[tmp.getLchild()]);
            }
            if (tmp.getRchild() != -1) {
                // 将当前结点的右孩子结点入队
                q.add(data[tmp.getRchild()]);
            }
        }
        return str;
    }

    // 层次遍历
    public void traverse() {
        //根结点的位置
        int root = 2 * leafNum - 2;
        // 根结点为空
        if (root == -1) {
            return;
        }
        int sum = preorder(data[root], "");
        System.out.println("所有报文长度为（位）：" + sum);
    }

    // 判断是否是叶子结点
    public boolean isLeaf(HNode p) {
        return ((p != null) && (p.getLchild() == -1) && (p.getRchild() == -1));
    }

}
