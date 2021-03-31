package yuqian.wang13.Override02;

public class NewPhone extends Phone{
    @Override
    public void show(){
//        System.out.println("显示号码");
        super.show();       //把父类show方法接着利用 然后添加新的功能
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
