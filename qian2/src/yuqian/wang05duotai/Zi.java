package yuqian.wang05duotai;

public class Zi extends Fu {
    int num = 20;

    int age = 21;

    public void method() {
        System.out.println("子类方法");
    }

    public void methodZi() {
        System.out.println("子特有");
    }

    @Override
    public void soutnum() {
        System.out.println(num);
    }
}
