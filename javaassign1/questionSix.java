import java.util.Arrays;
import java.util.Scanner;

public class questionSix{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int size = sc.nextInt();
        int[] arr = new int[size];    // size of array
        System.out.println("Enter all the elements:");
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();  // initializing elements of array
        }

        Arrays.sort(arr);   // sorting of element

        int []stack = new int[size];
        int top=-1;
        for (int i=0;i<size;i++){
            if(top==-1){
                stack[++top] = arr[i];
            }
            else if(stack[top]==arr[i]){
                top--;
            }
            else
                stack[++top] = arr[i];
        }
        if(top==-1)
            System.out.println("Enter Distinct value");
        else
        System.out.println(stack[top]);   // printing the element
    }

}