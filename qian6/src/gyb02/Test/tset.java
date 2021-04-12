package gyb02.Test;

import gyb02.collectiontype.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class tset {
    @Test
    public void Test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Array.xml");

        Stu stu=context.getBean("Stu",gyb02.collectiontype.Stu.class);

        stu.Test();

    }
}
