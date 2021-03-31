package yuqian.wang05;

public class ArrayRetur {
    public static void main(String[] args) {
        int[] array01=qianqian(10,20,30);
        System.out.println(array01[0]);
        System.out.println(array01[1]);
    }
    public static int[] qianqian(int a,int b,int c){
        int sum=a+b+c;
        int average=sum/3;
        int array[]={sum,average};
        return array;
    }
}
