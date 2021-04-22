package TestJun;

import IOC.gyb03.servies.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:Jdbc01.xml")
public class Jtest5 {
    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        userService.add();
    }
}
