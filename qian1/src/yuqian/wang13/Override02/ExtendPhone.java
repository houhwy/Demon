package yuqian.wang13.Override02;

public class ExtendPhone {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("=======================");
        NewPhone newPhone=new NewPhone();
        newPhone.show();
        newPhone.call();
        newPhone.send();
    }
}
