package yuqian.wang09;

import java.util.ArrayList;

public class ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student a=new Student("芊芊",3);
        Student b=new Student("雯雯",18);
        Student c=new Student("桓桓",16);
        Student d=new Student("媛媛",17);
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
            Student stu= list.get(i);
            System.out.println(stu.getName()+stu.getAge());
        }
    }
}
