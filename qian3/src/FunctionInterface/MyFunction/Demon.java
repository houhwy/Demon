package FunctionInterface.MyFunction;

public class Demon {
    public static void show(MyFunction mF) {
        mF.method();
    }

    public static void main(String[] args) {
        show(new MyFunctionImpl());

        show(new MyFunction() {
            @Override
            public void method() {
                System.out.println("匿名对象调用");
            }
        });

        show(() -> {
            System.out.println("lamada表达式调用");
        });

        show(() -> System.out.println("简化lamada表达式"));
    }
}
