package yuqian.wang03;
//重载
public class OverLoad {
    public static void main(String[] args) {
        System.out.println(sum(4,5));
        System.out.println(sum(5,6,7));
        System.out.println(sum(4,5,6,7));
//        System.out.println(sum(3,4,5,6,7));
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
}
