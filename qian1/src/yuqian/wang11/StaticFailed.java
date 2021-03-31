package yuqian.wang11;

public class StaticFailed {
    public static void main(String[] args) {
        Student stu1=new Student("芊",3);
        Student.room="深海";
        System.out.println(stu1.getName()+stu1.getAge()+stu1.room+stu1.num);
        Student stu2=new Student("雯",18);
        System.out.println(stu2.getName()+stu2.getAge()+stu2.room+stu2.num);
        System.out.println(stu1.room==stu2.room);
        System.out.println(stu2.room==Student.room);
    }
}
