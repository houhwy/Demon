package XianCheng.WaitNotify;

import java.util.concurrent.SynchronousQueue;

public class Demon {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread() {
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println("包子的种类和数量");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("吃包子");
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj) {
                    System.out.println("做好包子，可以吃了");
                    obj.notify();
                }
            }
        }.start();
    }
}
