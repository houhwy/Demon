package yuqian.wang12;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {
        int[] intArray={10,20,30};
        String intStr= Arrays.toString(intArray);       //将int数组按默认格式转换成字符串
        System.out.println(intStr);

        int[] array1={51,51,21,3,6,15,8,14,20};
        Arrays.sort(array1);                             //按升序排列
        System.out.println(Arrays.toString(array1));

        String[] array2={"bbb","aaa","ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
