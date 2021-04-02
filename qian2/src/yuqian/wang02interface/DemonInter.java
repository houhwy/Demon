package yuqian.wang02interface;

public class DemonInter {
    public static void main(String[] args) {
        MyInterfaceImpl inter = new MyInterfaceImpl();

        //抽象方法调用
        inter.methodabs1();

        //默认方法调用 不需要实现类重载 实现类通过继承的方式实现默认方法
        inter.methoddef();

        //静态方法调用 不需要实现类重载 通过接口名直接调用
        MyInterface.methodStatic();

        System.out.println(MyInterface.num);
    }
}
