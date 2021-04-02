package yuqian.wang06down;

public class Demo {
    public static void main(String[] args) {
        Animal animal = new cat();
        animal.eat();
//        animal.catchmouse;
        cat cat = (cat) animal;
        cat.catchmouse();

        //编译不会报错 但是运行会报错
//        dog dog=(dog)animal;
//        dog.watch();
    }
}
