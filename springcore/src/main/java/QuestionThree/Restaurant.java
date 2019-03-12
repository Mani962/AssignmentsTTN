package QuestionThree;
interface HotDrink{

    String prepareHotDrink();
}

class Tea implements HotDrink{

    @Override
    public String prepareHotDrink() {
        return "prearing Tea";
    }
}

class ExpressTea implements HotDrink{

    @Override
    public String prepareHotDrink()
    {
        return "preparing Express tea";
    }
}

class Restaurant{

    private HotDrink hotDrink;

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


