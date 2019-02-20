import java.util.Scanner;

public class questionOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String:");
        String currentString = sc.next();
        System.out.print("Enter The sub String:");
        String subString = sc.next();
        System.out.print("Enter The substring to replace in the original string:");
        String replaceBy = sc.next();
        System.out.print("The updated String:");
        String updatedString = currentString.replace(subString,replaceBy);
        System.out.println(updatedString);
    }
}