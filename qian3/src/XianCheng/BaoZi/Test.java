package XianCheng.BaoZi;

public class Test {
    public static void main(String[] args) {
        BaoZi baoZi = new BaoZi();
        new BaoZiPu(baoZi).start();
        new GuKe(baoZi).start();
    }

}
