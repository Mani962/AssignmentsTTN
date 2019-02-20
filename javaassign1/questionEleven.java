    interface Bank{
        void getBankDetails();
    }
    class SBI implements Bank{
        private String bankName = "SBI";
        private String branch = "Greater Noida";
        private float rateOfInterest = 9.0f;
        @Override
        public void getBankDetails() {
            System.out.println("Bank name : "+bankName+" Branch Name : "+branch+" Rate Of Interest : "+rateOfInterest);

        }
    }
    class BOI implements Bank {
        private String bankName = "BOI";
        private String branch = "Greater Noida";
        private float rateOfInterest = 8.0f;
        @Override
        public void getBankDetails() {
            System.out.println("Bank name : "+bankName+" Branch Name : "+branch+" Rate Of Interest : "+rateOfInterest);
        }
    }
    class ICICI implements Bank {
        private String bankName = "ICICI";
        private String branch = "Greater Noida";
        private float rateOfInterest = 7.0f;
        @Override
        public void getBankDetails() {
            System.out.println("Bank name : "+bankName+" Branch Name : "+branch+" Rate Of Interest : "+rateOfInterest);
        }
    }
    public class questionEleven {

        public static void main(String[] args) {

            SBI sbi = new SBI();
            BOI boi = new BOI();
            ICICI icici = new ICICI();

            sbi.getBankDetails();
            boi.getBankDetails();
            icici.getBankDetails();

        }

    }
