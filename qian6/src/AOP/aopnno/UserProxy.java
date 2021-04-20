package AOP.aopnno;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//@Order(1)  设置优先级 值越小优先级越大

@Component
@Aspect
public class UserProxy {
    @Pointcut(value = "execution(* AOP.aopnno.User.add(..))")
    public void pointadd(){}



//    @Before() 表示前置注解
    @Before(value = "pointadd()")
    public void before(){
        System.out.println("before...........");
    }

    @After(value = "execution(* AOP.aopnno.User.add(..))")
    public void after(){
        System.out.println("after...........");
    }

    @AfterReturning(value = "execution(* AOP.aopnno.User.add(..))")
    public void afterReturn(){
        System.out.println("afterReturn...........");
    }

    @AfterThrowing(value = "execution(* AOP.aopnno.User.add(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing...........");
    }

    @Around(value = "execution(* AOP.aopnno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("环绕之前...........");
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("环绕之后...........");
    }
}
