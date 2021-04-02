package yuqian.wang08;

public class Outer {
    private int num = 20;

    public class Iner {
        private int num = 10;

        public void method() {
            int num = 30;
            System.out.println(num);  //30
            System.out.println(this.num);  //10
            System.out.println(Outer.this.num);  //20
        }
    }
}
