package yuqian.wang05;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};
        for (int i=0;i<array.length;i++)
        System.out.println(array[i]);
        System.out.println("=================");
        for (int min=0,max=array.length-1;min<max;min++,max--){
            int empty;
            empty=array[min];
            array[min]=array[max];
            array[max]=empty;
        }
        for (int i=0;i<array.length;i++)
        System.out.println(array[i]);
    }
}
