package XianCheng.getName;

public class MyTheard extends Thread {
    @Override
    public void run() {
//        String name = getName();
//        System.out.println(name);

//        Thread t = new Thread().currentThread();
//        System.out.println(t);
//
//        String name=t.getName();
//        System.out.println(name);
        System.out.println(Thread.currentThread().getName());
    }
}
