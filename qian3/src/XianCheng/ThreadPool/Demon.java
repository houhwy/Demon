package XianCheng.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demon {
    public static void main(String[] args) {
        //创建一个容量为2的线程池
        ExecutorService ex = Executors.newFixedThreadPool(2);

        ex.submit(new RunableImpl());//线程池第一个线程             1
        ex.submit(new RunableImpl());//线程池第二个线程             2
        ex.submit(new RunableImpl());//线程池第一个返回后，继续使用   1

        ex.shutdown();//执行后线程池就无了
    }
}
