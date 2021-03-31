package yuqian.wang09;

import java.util.ArrayList;

public class MyArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
       // ArrayList<int> b=new ArrayList<>();         只能是引用类型不能是基本类型
        ArrayList<Integer> c=new ArrayList<>();
        c.add(111);
        c.add(2222);
        c.add(333);
        int num=c.get(1);
    }
}
