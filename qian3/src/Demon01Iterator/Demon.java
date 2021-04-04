package Demon01Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demon {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("芊芊");
        coll.add("许许");
        coll.add("蒙蒙");
        coll.add("宁宁");
        coll.add("雯雯");

        Iterator<String> a = coll.iterator();

        while (a.hasNext()) {
            String e = a.next();
            System.out.print(e);
        }
        System.out.println();


        for (String b : coll) {
            System.out.print(b);
        }
    }
}
