package yuqian.wang09;

import java.util.ArrayList;

public class ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("周");
        list.add("王");
        list.add("吕");
        list.add("韩");
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i==list.size()-1){
                System.out.println(list.get(i)+"}");
            }else {
                System.out.print(list.get(i)+"@");
            }
        }
    }
}
