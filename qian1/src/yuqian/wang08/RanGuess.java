package yuqian.wang08;

import java.util.Random;
import java.util.Scanner;

public class RanGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int num = r.nextInt(100)+1;
        while (true) {
            System.out.println("请输入数字");
            int n = sc.nextInt();
            if(n<num)
                System.out.println("太小了");
            if(n>num)
                System.out.println("太大了");
            if (n==num){
                System.out.println("恭喜你");
                break;
            }

        }
    }
}
