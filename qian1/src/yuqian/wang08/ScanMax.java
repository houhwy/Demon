package yuqian.wang08;

import java.util.Scanner;

public class ScanMax {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("输入第一个数");
        int a =sc.nextInt();
        System.out.println("输入第二个数");
        int b =sc.nextInt();
        System.out.println("输入第三个数");
        int c=sc.nextInt();
        int result=a>b?a:b;
        int max=result>b?result:b;
        System.out.println(max);
    }
}
