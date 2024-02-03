
//sum of diagonals

public class multiD_array {
    public static void main(String[]args)
    {       
        int arr[][] = {
            { -1, 2, 3}, // first row
            { 4, 5, 6 }, // second row
            { 7, -8, 9},// third row
            };
        int sum=0;
            for(int row=0;row<arr.length;row++)
            {
                for(int column=0;column<arr[0].length;column++)
                {
                    if(row==column)
                    {
                        sum=sum+arr[row][column];
                    }
                }
            }
            System.out.print("Sum of diagonals = "+sum);
            System.out.println();
    }
}