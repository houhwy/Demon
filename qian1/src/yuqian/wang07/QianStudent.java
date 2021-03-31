package yuqian.wang07;

public class QianStudent {
    public static void main(String[] args) {
        Student stu01=new Student();
        stu01.setAge(18);stu01.setName("芊芊");
        System.out.println(stu01.getName()+"永远"+stu01.getAge()+"岁");
        Student stu02=new Student("芊芊",3);
        System.out.println(stu02.getName()+"永远"+stu02.getAge()+"岁");
    }
}
