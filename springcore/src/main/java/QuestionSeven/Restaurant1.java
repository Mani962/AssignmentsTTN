package QuestionSeven;

interface HotDrink {

    String prepareHotDrink();
}

class Restaurant1 {


    private HotDrink hotDrink;

    public Restaurant1(HotDrink hotDrink) {
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
