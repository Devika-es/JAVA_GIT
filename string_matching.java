import java.util.Scanner;
public class string_matching {
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String pattern="//d{4}-//d{4}-//d{4}-//d{4}";
        // String pattern="[a-z0-9@.]+";
        System.out.println(str1.matches(pattern));
    }
}
