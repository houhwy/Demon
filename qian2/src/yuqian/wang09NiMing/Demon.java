package yuqian.wang09NiMing;

public class Demon {
    public static void main(String[] args) {
        MyInterface obj = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现");
            }
        };
        obj.method();

        new MyInterface() {
            public void method() {
                System.out.println("匿名对象，匿名内部类");
            }
        }.method();
    }
}
