package yuqian.wang01;

public class Demon3 {
    public static void main(String[] args) {
        int num=sum(40,3);
        System.out.println("结果是"+num);
        System.out.println("结果是"+sum(2,6));
        System.out.println("==================");
        sum1(20,2);
    }
    public static int sum(int a,int b){
        int result=a+b;
        return result;
    }
    public static void sum1(int a,int b){
        System.out.println("结果是"+(a+b));
    }
}