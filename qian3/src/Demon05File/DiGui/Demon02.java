package Demon05File.DiGui;

public class Demon02 {
    public static void main(String[] args) {
        int a = jc(5);
        System.out.println(a);
    }

    private static int jc(int n) {
        if (n == 1) {
            return 1;
        }
        return n * jc(n - 1);
    }
}
