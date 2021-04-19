package gyb.testDemon;


import gyb.Book;
import gyb.Ordeers;
import gyb.user;
import gyb01.serives.UseServies;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    @Test
    public void Testadd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        user user=context.getBean("user", gyb.user.class);

        System.out.println(user);
        user.add();

    }

    @Test
    public void TestBook(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");

        Book book=context.getBean("book",gyb.Book.class);

        System.out.println(book);
        book.testDemon();
    }

    @Test
    public void TestOrder(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");

        Ordeers ordeers =context.getBean("order",gyb.Ordeers.class);

        System.out.println(ordeers);
        ordeers.OrderTest();
    }

    @Test
    public void TestUseServes(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        UseServies ordeers = context.getBean("UseServies", UseServies.class);

        System.out.println(ordeers);
        ordeers.add();
    }
}
