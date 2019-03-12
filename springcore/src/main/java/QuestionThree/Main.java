package QuestionThree;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

        public class Main {
            public static void main(String[] args) {
                ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-config.xml");
                //Question4
                System.out.println(ctx.getBean("teaRestaurant"));
                System.out.println(ctx.getBean("teaExpressRestaurant"));

            }
        }

