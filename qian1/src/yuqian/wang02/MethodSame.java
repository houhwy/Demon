package yuqian.wang02;

public class MethodSame {
    public static void main(String[] args) {
//        qian(4,4);
//        qian(4,5);
        System.out.println(qian1(4,4));
        System.out.println(qian1(4,5));
        System.out.println(qian2(4,4));
        System.out.println(qian2(4,5));
    }
//    public static void qian(int a,int b){
//        if (a==b)
//            System.out.println("相同");
//        else
//            System.out.println("不同");
//    }
    public static boolean qian1(int a,int b){
        boolean result;
        if (a==b)
            result=true;
        else result=false;
//        result=a==b?true:false;
        return result;
    }
    public static boolean qian2(int a,int b){
        return a==b;
    }
}
