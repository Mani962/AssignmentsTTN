package QuestionSix;

import org.springframework.beans.factory.annotation.Autowired;

interface HotDrink{

    String prepareHotDrink();
}

class Tea implements HotDrink {

    @Override
    public String prepareHotDrink() {
        return "preparing Tea";
    }
}

class ExpressTea implements HotDrink {

    @Override
    public String prepareHotDrink()
    {
        return "preparing Express tea";
    }
}

class Restaurant{

    private HotDrink hotDrink;

    public Restaurant(){}

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


