package QuestionSeven;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class QuestionSeven {
    public static void main(String[] args) {
      ApplicationContext app = new ClassPathXmlApplicationContext("spring6.xml");

        Restaurant1 restaurant1 = (Restaurant1) app.getBean("teaRestaurant1");
        Restaurant1 restaurant2 = (Restaurant1) app.getBean("teaRestaurant1");
        System.out.println(restaurant1);
        System.out.println(restaurant2);
    }
}