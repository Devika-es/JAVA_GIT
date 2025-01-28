import java.util.*;
public class HI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long expectedsum=(long)n*(n+1)/2;
        long actual=0;
        for(int i=0;i<n-1;i++)
        {
            actual+=sc.nextInt();
        } 
        long s=expectedsum-actual;
        System.out.println(s);
        sc.close();
    }
}
