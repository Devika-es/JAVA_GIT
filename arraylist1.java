import java.util.*;
public class arraylist1 {
    public static void main(String args[])
    {
        ArrayList<Integer> aList=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String str1[] =sc.nextLine().trim().split(" ");
        for(String i : str1)
        {
            if(i.matches("[0-9]+"))
            {
                aList.add(Integer.parseInt(i));
            }
        }
        System.out.println(aList);
        ArrayList<Integer> bList=new ArrayList<>();
        for(int i=0;i<aList.size();i++)
        {
            if(isPrime(aList.get(i)) && aList.get(i)!=1)
            {
                bList.add(aList.get(i));
            }
        }
        System.out.println(bList);
    }
    public static boolean isPrime(int a)
    {
        boolean status = true;
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            {
                status=false;
                break;
            }
        }
        if(status==true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
