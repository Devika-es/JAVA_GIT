import java.util.Scanner;

public class exception_prac1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numerator: ");
        String numerator=sc.nextLine();
        System.out.print("Enter denominator: ");
        String denominator=sc.nextLine();
        try{
            
            float num=Float.parseFloat(numerator);
            float denom=Float.parseFloat(denominator);
            float result=num/denom;
            System.out.printf("Result: %.2f",result);
            
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator should not be zero");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Error: Invalid input");
        }
    }
}