public class q13{
    public static void main(String[] args) {
        try {
            throw new CreatedException("Threw Custom CreatedException");
        }
        catch (CreatedException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Caught Custom CreatedException:"+e);

        }
    }
}

class CreatedException extends Exception{
    public CreatedException(String s) {
        super(s);
    }
}