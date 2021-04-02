package yuqian.wang03Interface;

public interface MyInterfaceA {

    //1.接口没有静态代码块
    //static {}

    //1.接口没有构造方法的
    //public MyTnterfaceA(){}

    public abstract void A();

    public abstract void method();

    public default void Def() {
        System.out.println("AAA");
    }
}
