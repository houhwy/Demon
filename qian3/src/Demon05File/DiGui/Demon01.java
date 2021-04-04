package Demon05File.DiGui;

public class Demon01 {
    public static void main(String[] args) {
        int a = sum(100);
        System.out.println(a);
    }

    private static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}
