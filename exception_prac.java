import java.util.Scanner;
public class exception_prac {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int num=sc.nextInt();
        System.out.print("Enter the elements of the array: ");
        int arr1[]=new int[num];
        for(int i=0;i<num;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter index of the element: ");
        try{
            int num2=sc.nextInt();
            System.out.println(arr1[num2]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array size less than given input");
        }

    }
}
