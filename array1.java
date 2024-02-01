// sum of each row in an array
public class array1 {

    public static void main(String[] args)
    {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
       for(int row=0;row<arr.length;row++)
       {
        for(int column=0;column<arr[0].length;column++)
        {
            sum=sum+arr[row][column];    
        }
        System.out.print("Sum of each row "+sum);
        sum=0;
        System.out.println();
       }
    }


    
}
