package yuqian.wang09;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListReturn {
    public static void main(String[] args) {
        Random r =new Random();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int num=r.nextInt(100)+1;
            list.add(num);
        }
        ArrayList<Integer> small=S(list);
        System.out.println(small);
    }
    public static ArrayList<Integer> S(ArrayList<Integer> big) {
        ArrayList<Integer> small=new ArrayList<>();
        for (int i = 0; i < big.size(); i++) {
            if(big.get(i)%2==0)
                small.add(big.get(i));}
        return small;
    }
}
