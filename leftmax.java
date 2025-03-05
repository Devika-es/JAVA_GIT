import java.util.*;
public class leftmax
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int[] leftMax=new int[n];
        leftMax[0]=arr1[0];
        for(int i=1;i<n;i++)
        {
            leftMax[i]=Math.max(leftMax[i-1],arr1[i]);
        }
        System.out.println("Left max array is:");
        System.out.println(Arrays.toString(leftMax));

        
    }
}