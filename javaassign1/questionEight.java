public class questionEight
{

        public static void main(String[] args)
        {
            StringBuffer str = new StringBuffer("hi buddy how are you??");
            System.out.println("Original String: " + str);
            str.reverse();
            System.out.println("Reverse String: " + str);
            str.delete(4, 8);
            System.out.println("After Deleting: " + str);
        }
}

