import java.util.Scanner;
public class arrayProductExceptSelf {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr1=new int[n];
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
        productarray(arr1);

    }
    public static void  productarray(int[] arr1)
    {
        int n=arr1.length;
        int[] temp=new int[n];
        int left=1,right=1;
        for(int i=0;i<n;i++)
        {
            temp[i]=left;
            left*=arr1[i];

        }
        for(int i=n-1;i>=0;i--)
        {
            temp[i]*=right;
            right*=arr1[i];
        }
        System.out.print("[");
        for(int i=0;i<n;i++)
        {
            if(i!=n-1)System.out.print(temp[i]+", ");
            else{
                System.out.print(temp[i]);
            }
        }
        System.out.print("]");
    }
}
