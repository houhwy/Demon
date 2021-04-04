package XianCheng.SafeStatic;

public class Runableipml implements Runnable {
    int ticket = 100;

    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            method();
        }
    }

    public /*synchronized*/ void method() {
        synchronized (Runableipml.class) {
            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在卖" + ticket);
                ticket--;
            }
        }
    }
}
