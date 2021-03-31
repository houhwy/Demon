package yuqian.wang07;

public class ArrayDuixiang {
    public static void main(String[] args) {
        Student[] arrary = new Student[3];
        arrary[0]=new Student("芊",18);
        arrary[1]=new Student("小刚",36);
        arrary[2]=new Student("小红",54);
        System.out.println(arrary[0]);
        System.out.println(arrary[1]);     //地址
        System.out.println(arrary[2]);
        System.out.println(arrary[0].getName()+arrary[0].getAge());
        System.out.println(arrary[0].getName()+arrary[1].getAge());
        System.out.println(arrary[0].getName()+arrary[2].getAge());
    }
}
