package XianCheng.BaoZi;

public class BaoZiPu extends Thread {
    private BaoZi baoZi;

    public BaoZiPu(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (baoZi) {
                if (baoZi.exist == true) {
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (baoZi.exist == false) {
                    if (count % 2 == 0) {
                        baoZi.pi = "大大的";
                        baoZi.xian = "肉的";
                    } else if (count % 2 == 1) {
                        baoZi.pi = "小小的";
                        baoZi.xian = "素的";
                    }
                    count++;
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("正在生产" + baoZi.pi + baoZi.xian);
                    baoZi.exist = true;
                    baoZi.notify();
                }
            }
        }
    }
}
