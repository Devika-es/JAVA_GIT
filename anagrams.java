import java.util.*;
public class anagrams {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1[]=sc.nextLine().trim().split(" ");
        LinkedHashMap<String,Integer> map1=new LinkedHashMap<>();
        for(String i : str1)
        {
            if(map1.containsKey(i))
            {
                int count=map1.get(i);
                map1.put(i,count+1);
            }else{
                map1.put(i,1);
            }
        }
        Set<String> set1=map1.keySet();
        for(String i : set1)
        {
            System.out.println(i+" : "+map1.get(i));
        }
        
    }
}
