import java.util.Scanner;

public class questionFive {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array1:");
        int size1 = sc.nextInt(); //Size of array 1
        System.out.println("enter the no of elements:");
        int arr[] = new int[size1];
        for (int i=0;i<size1;i++)
            arr[i] = sc.nextInt(); //Intializing element in array 1
        System.out.println("enter the size of array2:");
        int size2 = sc.nextInt(); // Size of array 2
        System.out.println("enter the no of elements:");
        int[] arr1 = new int[size2];
        for (int i=0;i<size2;i++)
            arr1[i] = sc.nextInt(); //Intializing element in array 2

        for (int i=0;i<size1;i++){
            for (int j=0;j<size2;j++){
                if (arr[i]==arr1[j]){ //comparing elements
                    System.out.println(arr[i]); //printing the common elements
                    break;
                }
            }
        }
    }
}