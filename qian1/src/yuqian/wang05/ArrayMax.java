package yuqian.wang05;

public class ArrayMax {
    public static void main(String[] args) {
        int[] array={11111,5,15,20,30,10000};
        int max=array[0];
        int len=array.length;
        for(int i=0;i<len;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println(max);
    }
}
