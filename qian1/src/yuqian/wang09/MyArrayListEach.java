package yuqian.wang09;

import java.util.ArrayList;

public class MyArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("李");
        list.add("王");
        list.add("郭");
        list.add("吕");
        list.add("房");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
