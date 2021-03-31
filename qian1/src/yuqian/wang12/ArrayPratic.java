package yuqian.wang12;

import java.util.Arrays;

public class ArrayPratic {
    public static void main(String[] args) {
        String str="gweugbdwecwqhc782gbcq";
        //如何进行升序排列
        //必须是个数组才能进行arrays升序排列
        char[] chars=str.toCharArray();
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));

        //倒序遍历
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
