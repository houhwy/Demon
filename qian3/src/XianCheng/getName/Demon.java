package XianCheng.getName;

public class Demon {
    public static void main(String[] args) {
        MyTheard my = new MyTheard();
        my.start();

        new MyTheard().start();
        new MyTheard().start();

        System.out.println(Thread.currentThread().getName());
    }
}
