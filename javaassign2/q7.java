import java.util.*;
    public class q7 {
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Input seconds: ");
            int seconds = in.nextInt();
            int p1 = seconds % 60;
            int p2 = seconds / 60;
            int p3 = p2 % 60;
            p2 = p2 / 60;
            System.out.print( p2 + ":hours \t" + p3 + ":minutes \t" + p1 +":seconds");
            System.out.print("\n");
        }
    }


