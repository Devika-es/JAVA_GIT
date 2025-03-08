import java.util.*;

public class happynumbers {
    public static boolean isHappy(int n) {
      HashSet<Integer> happy=new HashSet<>();
      while(n!=1)
      {
        if(happy.contains(n))return false;
        happy.add(n);
        int sum=0;
        while(n>0)
        {
            int digit=n%10;
            sum+=digit*digit;
            n=n/10;
        }
        n=sum;

      }
       return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        if(isHappy(n))
        {
          
            System.out.println(n+" is a happy number");
        }
        else{
            System.out.println(n+" is not a happy number");
        }
    }
}

