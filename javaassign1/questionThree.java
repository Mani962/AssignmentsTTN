public class questionThree
{
    public static void main(String[] args)
    {
        String str = "This is an Example Of The Character";
        System.out.println("Length Of String:" + str.length());
        int charcount = str.length() - str.replaceAll("a", "").length();
        System.out.println("Occurrence Of (a) Char In String: " + charcount);
    }
}
