import java.util.Scanner;
public class palindromeCheck {
    public static boolean isPalindrome(String input)
    {
        StringBuilder sb=new StringBuilder(input);
        return input.equals(sb.reverse().toString());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input=sc.nextLine();
        System.out.println("Is palindrome? "+isPalindrome(input));

    }
}
