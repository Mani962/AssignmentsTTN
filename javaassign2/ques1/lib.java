import java.util.Scanner;

abstract class library
{
    abstract void issuebooks();
    abstract void returnbooks();
    abstract void showbooks();
}
class librarian extends library
{
    String name;
    int id;
    static int bookscount=0;
    void issuebooks()
    {

        Scanner sc =new Scanner(System.in);

        System.out.println("enter the book name : ");
        name = sc.next();
        System.out.println("enter the book id : ");
        id = sc.nextInt();
        bookscount++;
        System.out.println("books taken "+bookscount);

    }

    void returnbooks()
    {

        System.out.println("books returned successfully");
        bookscount--;
        System.out.println("number of books taken "+bookscount);



    }


    void showbooks()
    {
        System.out.println("the book name issued is :"+name);
        System.out.println("the book id is :"+id);
    }

}


class lib
{
    public static void main(String args[])
    {
        library lib=new librarian();
        do {


            System.out.println("MENU");
            System.out.println("1.issue books");
            System.out.println("2.return books");
            System.out.println("3.show book details");
            System.out.println("4.exit");
            System.out.println("enter choice :");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            if (choice == 1)
                lib.issuebooks();
            else if (choice == 2)
                lib.returnbooks();
            else if(choice == 3)
                lib.showbooks();
            else
                System.exit(0);

        }while(true);
    }


}