package IOC.gyb.testDemon;


import IOC.gyb.Book;
import IOC.gyb.Ordeers;
import IOC.gyb.user;
import IOC.gyb01.serives.UseServies;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    @Test
    public void Testadd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("IOC01.xml");

        user user=context.getBean("user", IOC.gyb.user.class);

        System.out.println(user);
        user.add();

    }

    @Test
    public void TestBook(){
        ApplicationContext context=new ClassPathXmlApplicationContext("IOC01.xml");

        Book book=context.getBean("book", IOC.gyb.Book.class);

        System.out.println(book);
        book.testDemon();
    }

    @Test
    public void TestOrder(){
        ApplicationContext context=new ClassPathXmlApplicationContext("IOC01.xml");

        Ordeers ordeers =context.getBean("order", IOC.gyb.Ordeers.class);

        System.out.println(ordeers);
        ordeers.OrderTest();
    }

    @Test
    public void TestUseServes(){
        ApplicationContext context = new ClassPathXmlApplicationContext("IOC02.xml");

        UseServies ordeers = context.getBean("UseServies", UseServies.class);

        System.out.println(ordeers);
        ordeers.add();
    }
}
