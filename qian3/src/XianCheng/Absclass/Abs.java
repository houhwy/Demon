package XianCheng.Absclass;

public class Abs {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(Thread.currentThread().getName());
                }
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(Thread.currentThread().getName());
                }
            }
        }).start();
    }
}
