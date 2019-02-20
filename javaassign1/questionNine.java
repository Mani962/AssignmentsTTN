  enum Rent{
        Alpha(5000),
        Beta(7500),
        Omega(11000),
        Delta(9500);

        private final int price;

        Rent(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }

    }
    public class  questionNine  {
        Rent rent;
        questionNine(Rent rent){
            this.rent = rent;
        }

        public static void main(String[] args) {
            for(Rent house : Rent.values()){
                System.out.println("House name : "+house+"\n Rent : "+house.getPrice());
            }

        }
    }
