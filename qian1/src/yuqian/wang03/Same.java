package yuqian.wang03;

public class Same {
    public static void main(String[] args) {
        System.out.println(qian((byte) 1,(byte) 1));
        System.out.println(qian((short) 1,(short)1));
        System.out.println(qian((int)1,(int) 1));
        System.out.println(qian((long) 1,(long) 1));
    }
    public static boolean qian(byte a,byte b){
        System.out.println("byte");
        return a==b;
    }
    public static boolean qian(short a,short b){
        System.out.println("short");
        return a==b;
    }
    public static boolean qian(int a,int b){
        System.out.println("int");
        return a==b;
    }
    public static boolean qian(long a,long b){
        System.out.println("long");
        return a==b;
    }
}
