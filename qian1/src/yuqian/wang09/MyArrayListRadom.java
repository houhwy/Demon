package yuqian.wang09;

import java.util.ArrayList;
import java.util.Random;

public class MyArrayListRadom {
    public static void main(String[] args) {
        Random random=new Random();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0;i<6;i++){
            int a=random.nextInt(100)+1;
            list.add(a);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
