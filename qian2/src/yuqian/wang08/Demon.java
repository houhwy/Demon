package yuqian.wang08;

public class Demon {
    public static void main(String[] args) {
        //通过外部类方法调用内部类方法
        Body body = new Body();
        body.methodBody();

        //通过创建内部类对象来调用
        Body.Heart heart = new Body().new Heart();
        heart.beat();

        Outer.Iner iner = new Outer().new Iner();
        iner.method();
    }
}
