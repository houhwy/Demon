package XianCheng.SafeMethod;

public class Demon {
    public static void main(String[] args) {
        Runableipml run = new Runableipml();
        Thread thread = new Thread(run);
        Thread thread1 = new Thread(run);
        Thread thread2 = new Thread(run);
        thread.start();
        thread1.start();
        thread2.start();
    }
}
