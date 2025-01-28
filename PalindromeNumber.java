import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;  // Get last digit
            reversedNum = reversedNum * 10 + digit; // Append digit
            num /= 10; // Remove last digit
        }

        // Compare original with reversed
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is NOT a palindrome.");
        }
    }
}

