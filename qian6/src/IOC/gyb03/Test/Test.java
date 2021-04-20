package IOC.gyb03.Test;

import IOC.gyb03.servies.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void ServiceTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("IOC04.xml");
        UserService userService=context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
    @org.junit.Test
    public void SpringConfig(){
        ApplicationContext context = new ClassPathXmlApplicationContext("IOC04.xml");
        UserService userService=context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
