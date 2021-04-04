package XianCheng.Runable;

public class Demon {
    public static void main(String[] args) {
        RunableImpl run = new RunableImpl();
        Thread thread = new Thread(run);
        thread.start();
        Thread thread1 = new Thread(new RunableImpl2());
        thread1.start();
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }


}
