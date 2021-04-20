package IOC.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void beanTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("IOC03.xml");
        Orders orders = context.getBean("orders",Orders.class);
        System.out.println("获取实例化对象");
        System.out.println(orders);
        context.close();
    }
}
