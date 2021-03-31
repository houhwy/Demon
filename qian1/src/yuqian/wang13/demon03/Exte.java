package yuqian.wang13.demon03;
//1.子类构造方法当中有一个隐含的super（）调用，所以是先父类后子类
//2.子类构造可以通过super来调用父类重载
//3.super的父类构造调用，必须是子类构造方法的第一个语句
public class Exte {
    public static void main(String[] args) {
        Zi zi=new Zi();
    }
}
