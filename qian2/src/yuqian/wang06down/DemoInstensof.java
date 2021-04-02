package yuqian.wang06down;

public class DemoInstensof {
    public static void main(String[] args) {
        Animal animal = new cat();

        if (animal instanceof cat) {
            cat cat = (cat) animal;
            cat.catchmouse();
        }

        if (animal instanceof dog) {
            dog dog = (dog) animal;
            dog.watch();
        }

        meth(new cat());
        meth(new dog());

    }

    public static void meth(Animal animal) {
        if (animal instanceof cat) {
            cat cat = (cat) animal;
            cat.catchmouse();
        }

        if (animal instanceof dog) {
            dog dog = (dog) animal;
            dog.watch();
        }
    }


}
