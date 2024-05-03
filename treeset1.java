import java.util.*;
public class treeset1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String arr1[]=sc.nextLine().trim().split(" ");
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        int maxfreq=sc.nextInt();
        for(String i : arr1)
        {
            if(map.containsKey(i))
            {
                int count=map.get(i);
                map.put(i,count+1);
            }
            else{
                map.put(i,1);
            }
        }
        int removed=0;
        TreeSet<String> tset1=new TreeSet<>();
        Set<String> set1=map.keySet();
        for(String i : set1)
        {
            if(map.get(i) <= maxfreq)
            {
                tset1.add(i);
            } 
            else{
                removed++;
            }
        }
        if(removed==0)
        {
            System.out.println("No elements removed");
        }
        System.out.println(tset1);
        

    }
}
