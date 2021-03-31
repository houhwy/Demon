package yuqian.wang08;

import java.util.Random;

public class RanFanwei {
    public static void main(String[] args) {
        int n = 5;
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(n);           //n=5 随机数范围是0~4
            System.out.println(num);
        }
            System.out.println("====================");
            for (int i = 0; i < 10; i++) {
                int num1 = r.nextInt(n) + 1;           //n=5 随机数范围是1~5
                System.out.println(num1);
            }
        }
    }