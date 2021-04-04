package Demon02FanXIng;

public class Demon {
    public static void main(String[] args) {
        Gg gg = new Gg();
        gg.setName("傻逼");
        Object obj = gg.getName();
        System.out.println(obj);
//        String str = gg.getName();


        Gg<Integer> gg1 = new Gg<Integer>();
        gg1.setName(5);
        Integer i = gg1.getName();

        Gg<String> gg2 = new Gg<>();
        gg2.setName("雯雯");
        String str = gg2.getName();


        Ww ww = new Ww();
        ww.Qq(5);
        Ww.Hh("a");
    }
}
