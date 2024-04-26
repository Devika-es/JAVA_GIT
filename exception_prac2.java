import java.util.Scanner;

class OverflowException extends Exception {
    public OverflowException(String message) {
        super(message);
    }
}

public class exception_prac2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();
        long max = Integer.MAX_VALUE; 
        try {
            long result = (long) num1 * num2; 
            if (result <= max) { 
                System.out.println("Multiplication: " + result);
            } else {
                throw new OverflowException("Error: Result exceeds the maximum value");
            }
        } catch (OverflowException e) {
            System.out.println(e.getMessage());
        }
    }
}