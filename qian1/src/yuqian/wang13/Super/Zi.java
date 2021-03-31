package yuqian.wang13.Super;

public class Zi extends Fu{
    int num=20;
    public Zi(){
        super(); //调用父类构造方法
    }
    public void methodZi(){
        System.out.println(num);
        System.out.println(super.num);  //调用父类的
    }
    public void method(){
        super.method(); //调用父类method方法
        System.out.println("子类");
    }
}
