package XianCheng.BaoZi;

public class GuKe extends Thread {
    private BaoZi baoZi;

    public GuKe(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (baoZi) {
                if (baoZi.exist == false) {
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("吃" + baoZi.pi + baoZi.xian);
                baoZi.exist = false;
                baoZi.notify();
                System.out.println("唤醒");
            }
        }
    }
}
