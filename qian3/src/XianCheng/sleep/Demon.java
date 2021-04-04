package XianCheng.sleep;

import static java.lang.Thread.*;

public class Demon {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 60; i++) {
            System.out.println(i);

            Thread.sleep(1000);
        }

    }
}
