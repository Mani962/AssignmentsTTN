public class q4 {

    private static q4 myObj;

    static{
        myObj = new q4();
    }

    private q4(){

    }

    public static q4 getInstance(){
        return myObj;
    }

    public void testMe(){
        System.out.println("Hey.... it is working!!!");
    }

    public static void main(String a[]){
        q4 ms = getInstance();
        ms.testMe();
    }
}