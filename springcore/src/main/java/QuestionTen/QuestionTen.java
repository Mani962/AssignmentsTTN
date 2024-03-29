package QuestionTen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

interface HotDrink {

    String prepareHotDrink();
}

@Component()
class Restaurant {

    @Autowired
    @Qualifier("tea")
    private HotDrink hotDrink;

    Restaurant() {
    }

    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }


    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    @Override
    public String toString() {

        return "Restaurant1{" +
                "hotDrink=" + hotDrink.prepareHotDrink() +
                '}';
    }
}

@Component()
class Tea implements HotDrink {

    @Override
    public String prepareHotDrink() {
        return "Preparing Tea..";
    }
}

@Component
class ExpressTea implements HotDrink {

    @Override
    public String prepareHotDrink() {
        return "Preparing ExpressTea..";
    }
}

public class QuestionTen {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring10.xml");
        System.out.println(app.getBean("restaurant"));
        ((ClassPathXmlApplicationContext) app).close();
    }
}