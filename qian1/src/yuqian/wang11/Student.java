package yuqian.wang11;

public class Student {
    private String name;
    private int age;
    static String room;
    static int num;
    private static int numadd=0;        //学号随着对象创建自动累加
    public Student(){
        numadd++;
    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
        num=++numadd;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static int getNum() {
        return num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setRoom(String room) {
        Student.room = room;
    }

    public static void setNum(int num) {
        Student.num = num;
    }
}
