package yuqian.wang12;

public class MathPractice {
    public static void main(String[] args) {
        double min=-10.8;
        double max=5.9;
        int count=0;
        for (int i = (int)min; i <max ; i++) {                 //将min强转成为int 循环区间内所有的整数
            int abs=Math.abs(i);
            if (abs>6 || abs<2.1){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("总共有"+count+"个");
    }
}
