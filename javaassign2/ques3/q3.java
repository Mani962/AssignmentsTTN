public class q3 {


        public static void main(String args[]) {
            try
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");
            }
            catch (ClassNotFoundException ex)
            {
                ex.printStackTrace();
            }
        }
    }

