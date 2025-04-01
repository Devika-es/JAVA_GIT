import java.util.*;
public class validAnagrams {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        Boolean result=isAnagram(s,t);
        System.out.println("IsAnagram: "+result);
    }
    public static boolean isAnagram(String s,String t)
    {
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return(Arrays.equals(arr1,arr2));

    }
}
