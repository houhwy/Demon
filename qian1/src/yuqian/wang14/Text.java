package yuqian.wang14;

import java.util.ArrayList;

public class Text {
    public static void main(String[] args) {
        Manager manager=new Manager("群主",100);
        Member member1=new Member("一号",20);
        Member member2=new Member("二号",10);
        Member member3=new Member("三号",14);
        Member member4=new Member("四号",80);

        manager.show();
        member1.show();
        member2.show();
        member3.show();
        member4.show();
        System.out.println("==============");

        ArrayList<Integer> redlist=manager.send(70,4);

        member1.recieve(redlist);
        member2.recieve(redlist);
        member3.recieve(redlist);
        member4.recieve(redlist);

        manager.show();
        member1.show();
        member2.show();
        member3.show();
        member4.show();
    }
}
