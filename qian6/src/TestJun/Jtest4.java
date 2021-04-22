package TestJun;

import IOC.gyb03.servies.UserService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //指定框架版本
@Configuration("classpath:Jbc01.xml")  //加载配置文件
public class Jtest4 {
    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        userService.add();
    }
}
