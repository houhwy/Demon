package yuqian.wang11;

public class Person {
    static {
        System.out.println("静态代码块执行了");
    }
    public Person(){
        System.out.println("构造方法执行");
    }
}
