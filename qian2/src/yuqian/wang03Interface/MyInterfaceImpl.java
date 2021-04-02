package yuqian.wang03Interface;

public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB {

    @Override
    public void A() {
        System.out.println("覆盖重写了A方法");
    }

    @Override
    public void B() {
        System.out.println("覆盖重写了B方法");
    }

    @Override
    public void method() {

    }

    @Override
    public void Def() {
        System.out.println("重写的默认方法");
    }
}
