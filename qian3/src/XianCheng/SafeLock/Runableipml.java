package XianCheng.SafeLock;

import java.util.concurrent.locks.ReentrantLock;

public class Runableipml implements Runnable {
    int ticket = 100;
    ReentrantLock re = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            re.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "正在卖" + ticket);
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    re.unlock();  //无论是否出现异常，都把锁对象释放
                }

            }
        }
    }
}