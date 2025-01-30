import java.util.*;
public class BinarySearchIterative
{
    public static int binarySearch(int arr[],int key)
    {
        int left=0;
        int right=arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            else if(arr[mid]<key)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return -1;//Element not found

    }
    public static void main(String[] args) {
        int arr[]={78,45,32,90,-8,23,11,65,89};
        int key=-8;
        Arrays.sort(arr);
        System.out.println("Sorted array : "+Arrays.toString(arr));
        int index=binarySearch(arr,key);
        if(index!=-1)
        {
            System.out.println("Element found at index: "+index);
        }
        else{
            System.out.println("Element not found");
        }
    }
}