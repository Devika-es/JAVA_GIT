
import java.util.*;

public class missingnumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long expectedSum = (long) n * (n + 1) / 2;  
        long actualSum = 0;

        for (int i = 0; i < n - 1; i++) {
            actualSum += sc.nextInt();
        }

        System.out.println(expectedSum - actualSum);  
        sc.close();
    }
}
