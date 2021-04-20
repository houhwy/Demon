package SJDBC.lwy01.tset;

import SJDBC.lwy01.entity.User;
import SJDBC.lwy01.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Test
    public void testJDBC(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Jdbc01.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        User user=new User();
        user.setUserId("01");
        user.setUsername("雯雯");
        user.setUstatus("love");
        bookService.addBook(user);
    }
}
