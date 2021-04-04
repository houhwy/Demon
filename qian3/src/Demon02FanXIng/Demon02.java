package Demon02FanXIng;

import java.util.ArrayList;
import java.util.Iterator;

public class Demon02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("雨芊");
        list1.add("芊芊");


        printArray(list);
        printArray(list1);
    }

    public static void printArray(ArrayList<?> list) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
