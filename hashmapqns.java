import java.util.*;
public class hashmapqns {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        System.out.print("Enter elements: ");
        int[] arr1=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
       for(int num : arr1)
       {
            if(map.containsKey(num))
            {
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
       }
       for(HashMap.Entry<Integer,Integer> entry : map.entrySet())
       {
            System.out.println(entry.getKey()+" "+entry.getValue());
       }
    }

}
