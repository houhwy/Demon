package yuqian.wang02;
//1~100的和
public class MethodSum {
    public static void main(String[] args) {
        qian();
    }
    public static void qian(){
        int sum=0;
        for (int i=1;i<=100;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
