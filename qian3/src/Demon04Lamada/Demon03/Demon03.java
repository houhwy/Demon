package Demon04Lamada.Demon03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Demon03 {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("雯雯", 21),
                new Person("芊芊", 18),
                new Person("昨昨", 20)
        };

//        Arrays.sort(arr, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
        Arrays.sort(arr, (Person o1, Person o2) -> {
            return o1.getAge() - o2.getAge();
        });

        for (Person p : arr) {
            System.out.println(p);
        }
    }


}
