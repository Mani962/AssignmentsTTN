package QuestionSix;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring6.xml");

        System.out.println(ctx.getBean("restaurant"));
        System.out.println(ctx.getBean("restaurant1"));
        System.out.println(ctx.getBean("restaurant2"));
       // System.out.println(ctx.getBean("teaExpressRestaurant"));

    }
}
