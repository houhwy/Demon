package yuqian.wang11;

public class PerStatic {
    public static void main(String[] args) {
        Person one=new Person();            //静态代码块永远优先运行
        Person two=new Person();            //静态代码块只运行一次
    }
}
