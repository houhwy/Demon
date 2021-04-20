package AOP.aopxml.test;

import AOP.aopxml.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class xmlTest {
    @Test
    public void xml(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Aopxml02.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }
}
