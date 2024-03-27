public class Exception {
    public static void main(String args[])
    {
        int a=10;
        int b=0;
        try{
            b = 100/b;

        }
        catch(ArithmeticException e)
        {
            b=100/1;
            System.out.println("Default value is "+b);
        }
    }
}
