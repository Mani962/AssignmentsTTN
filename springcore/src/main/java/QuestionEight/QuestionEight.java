package QuestionEight;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

interface HotDrink {
    String prepareHotDrink();
}

class Restaurant {

    private HotDrink hotDrink;

    public HotDrink getHotDrink() {
        return hotDrink;
    }
    @Required
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

class Tea implements HotDrink {

    @Override
    public String prepareHotDrink() {
        return "Preparing Tea..";
    }
}

class ExpressTea implements HotDrink {

    @Override
    public String prepareHotDrink() {
        return "Preparing ExpressTea..";
    }
}

class QuestionEight {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring8.xml");
        System.out.println(app.getBean("teaRestaurant"));
        ((ClassPathXmlApplicationContext) app).close();
    }
}