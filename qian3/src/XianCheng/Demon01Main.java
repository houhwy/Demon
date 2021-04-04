package XianCheng;

public class Demon01Main {
    public static void main(String[] args) {
        MyThread my = new MyThread();
        my.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("mian" + i);
        }
    }
}
