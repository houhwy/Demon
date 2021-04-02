package yuqian.wang05duotai;
//1．直接通过对象名称访问成员变量:看等号左边是谁，优先用谁，没有则向上找
// 2.间接通过成员方法访问成员变量:看该方法属于谁,优先用谁,没有则向上找。
//在多态的代码当中,成员方法的访问规则是:看new的是谁,就优先用谁，没有则向上找。

//成员变量:编译看左边,运行还看左边。
// 成员方法:编译看左边,运行看右边。
public class Demo {

    public static void main(String[] args) {
        Fu qian = new Zi();

        qian.method();      //优先使用Zi类方法
        qian.methodFu();

        System.out.println(qian.num);       //优先使用父类成员变量

//父类中没有age，只能向上找（父类只能从Object类找），所以子类的age无法调用
//        System.out.println(qian.age);

        qian.soutnum();//若子类木有覆盖重写，调用父类的；若子类覆盖重写了，调用子类的

        //编译看左边，父类没有methodZi所以不能编译
        //qian.methodZi();

        //编译看左边，Fu有；运行看右边，优先调用子类
        qian.method();
    }
}
