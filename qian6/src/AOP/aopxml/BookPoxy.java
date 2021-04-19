package AOP.aopxml;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BookPoxy {
    public void before(){
        System.out.println("Before...........");
    }
}
