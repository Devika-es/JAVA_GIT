import java.util.*;
public class reverseArray {
    public static void arrayreverse(int[] arr)
    {
        int left=0,right=arr.length-1;
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }

    }
    public static void printarray(int[] arr)
    {
        for(int i : arr)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array: ");
        printarray(arr);
        arrayreverse(arr);
        System.out.println("Reversed array: ");
        printarray(arr);
        
    }
}
