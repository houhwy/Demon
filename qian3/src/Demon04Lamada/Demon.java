package Demon04Lamada;

public class Demon {
    public static void main(String[] args) {
        //匿名内部类
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(Thread.currentThread().getName() + "线程运行了");
                    }
                }
        ).start();

        //lamada表达式
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "线程运行了");
        }
        ).start();
    }
}
