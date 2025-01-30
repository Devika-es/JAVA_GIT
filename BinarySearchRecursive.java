import java.util.*;
public class BinarySearchRecursive {
    public static int binarySearch(int arr[],int left,int right,int key)
    {
        if(left>right)
        {
            return -1;
        }
        int mid=left+(right-left)/2;
        if(arr[mid]==key)
        {
            return mid;
        }
        else if(arr[mid]<key)
        {
            return binarySearch(arr,mid+1,right,key);
        }
        else{
            return binarySearch(arr,left,mid-1,key);
        }
    }
    public static void main(String[] args) {
        int arr[]={23,54,76,8,91,45,93,22,55};
        
        Arrays.sort(arr);
        System.out.println("Sorted array: "+Arrays.toString(arr));
        int key=45;
        int index=binarySearch(arr,0,arr.length-1,key);
        if(index!=-1)
        {
            System.out.println("Element found at index: "+index);

        }
        else{
            System.out.println("Element not found");
        }
    }
}
