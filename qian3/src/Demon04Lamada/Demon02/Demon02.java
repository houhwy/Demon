package Demon04Lamada.Demon02;

public class Demon02 {
    public static void main(String[] args) {
        L(new Cook() {
            @Override
            public void makefood() {
                System.out.println("chi");
            }
        });
        L(() -> {
            System.out.println("chi");
        });

    }

    public static void L(Cook cook) {
        cook.makefood();
    }
}
