package gyb03.Test;

import bean.Orders;
import gyb01.serives.UseServies;
import gyb03.servies.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void ServiceTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        UserService userService=context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
