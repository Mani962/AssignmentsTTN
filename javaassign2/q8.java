import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string:");
        String s = sc.next();
        while (!s.equals("done")) {

            if (s.charAt(0) == s.charAt(s.length() - 1))
            {
                System.out.println("the first character and the last character are equal in this string");
            }
            else
            {
                System.out.println("the first character and the last character are not equal in this string");

            }

            s=sc.next();

        }
/*        do {

            if (s.charAt(0) == s.charAt(s.length() - 1))
            {
                System.out.println("the first character and the last character are equal in this string");
            }
            else
            {
                System.out.println("the first character and the last character are not equal in this string");

            }

            s=sc.next();

        }while (!s.equals("done")) ;*/
    }
}
