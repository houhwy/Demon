package yuqian.wang09;

import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);
        list.add("芊芊");
        list.add("18");
        boolean sucess= list.add("hhh");
        System.out.println(list);
        System.out.println("数据传入是否成功："+sucess);
        String a=list.get(0);
        System.out.println(a);
        list.remove(2);
        System.out.println(list);
        list.add("hhh");
        String whoRemoved= list.remove(2);
        System.out.println("谁被删除了："+whoRemoved);
        int b=list.size();
        System.out.println(b);
    }
}
