package yuqian.wang05;

public class array01 {
    public static void main(String[] args) {
        int[] array01=new int[]{1,5,15,4,8};
        int[] array02={1,2,5,7,8};
        System.out.println(array01);        //数组地址
        System.out.println(array01[1]);
        System.out.println(array02);
        int[] array3=array02;
        System.out.println(array3);         //地址相同
        int i=array3.length;                //获取数组长度
        System.out.println(i);
    }
}
