package yuqian.wang03Interface;

public interface MyInterfaceB {
    public abstract void B();

    public abstract void method();

    public default void Def() {
        System.out.println("BBB");
    }

}
