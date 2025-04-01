import java.util.*;
public class powerset {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int arr1[] =new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.print("[");
        for(int i=0;i<n;i++)
        {
            if(i!=n-1)System.out.print(arr1[i]+", ");
            else{
                System.out.print(arr1[i]);
            }
        }
        System.out.print("]");
        System.out.println();
        List<List<Integer>> result=powerset1(arr1);
        System.out.println("Powerset: "+result);
    }
    public static List<List<Integer>> powerset1(int[] arr1)
    {
        List<List<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<>());
        for(int num: arr1)
        {
            int size=result.size();
            for(int i=0;i<size;i++)
            {
                List<Integer> newSubset=new ArrayList<>(result.get(i));
                newSubset.add(num);
                result.add(newSubset);
            }
        }
        return result;
    }
}
