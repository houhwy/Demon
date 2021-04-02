package yuqian.wang02interface;

public interface MyInterface {

    //抽象方法 public abstract可省略
    public abstract void methodabs1();

    abstract void methodabs2();

    public void methodabs3();

    void methodabs4();

    //默认方法 实现类不重载 public可省略
    public default void methoddef() {
        System.out.println("默认方法");
    }

    ;

    //静态方法 实现类不重载 通过接口名直接调用
    public static void methodStatic() {
        System.out.println("静态方法");
    }


    //    //私有方法使用 java9才有
//    //1.默认方法重复内容
    //private        private static
//    public default void def1(){
//        Com();
//    }
//    public default void def2(){
//        Com();
//    }
//    //私有方法定义
//    private void Com(){
//        System.out.println("AAA");
//    }
    //常量
    public static final int num = 11;


}
