package yuqian.wang13.This;
//super用来访问父类内容 this用来访问本类内容
//1.调用本类成员变量
//2.调用本类成员方法
//3.调用本类的构造方法
public class Zi extends Fu{
    int num=20;
    public void showNum(){
        int num=10;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
    public void methodA(){
        System.out.println("AAA");
    }
    public void methodB(){
        //methodA();
        this.methodA();
        System.out.println("BBB");
    }
}
