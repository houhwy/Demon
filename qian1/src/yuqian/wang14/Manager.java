package yuqian.wang14;

import java.util.ArrayList;

public class Manager extends User{
    public Manager(){}

    public Manager(String name,int money) {
        super(name,money);
    }

    public ArrayList<Integer> send(int totalmoney,int count) {
        ArrayList<Integer> redlist = new ArrayList<>();
        int leftmoney = super.getMoney();
        if (totalmoney > leftmoney) {
            System.out.println("余额不足");
            return redlist;
        }
        super.setMoney(leftmoney - totalmoney);

        int avg = totalmoney / count;
        int mod = totalmoney % count;

        for (int i = 0; i < count - 1; i++) {
            redlist.add(avg);
        }
        int last = avg + mod;
        redlist.add(last);

        return redlist;
    }
}
