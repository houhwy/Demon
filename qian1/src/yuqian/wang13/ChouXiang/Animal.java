package yuqian.wang13.ChouXiang;
    //返回值前加上abstra，去掉大括号
    //抽象类，抽象方法所在的类必须是抽象类，在class之前加上abstract

/*如何使用抽象类和抽象方法，
 1.不能直接创建new抽象类对象
 2.必须用一个子类继承抽象类
 3.子类必须覆盖重写抽象父类中的所有抽象方法
 4.创建子类对象使用
 */
public abstract class Animal {
    //抽象方法定义
    public abstract void eat();

    //普通的成员方法也可以定义
    public void normalMethod(){}
}
