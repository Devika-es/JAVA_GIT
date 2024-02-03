//swapping first and last row
public class twod_array {
    public static void main(String[]args)
    {
        //replace first and last row 
        int arr[][] = {
            { -1, 2, 3}, // first row
            { 4, 5, 6 }, // second row
            { 7, -8, 9},// third row
            {10, 4, 4} //fourth row
            };
        int numRows = arr.length;
        int numCols = arr[0].length;
        for(int i=0;i<numCols;i++)
        {
            int temp = arr[0][i];
            arr[0][i] = arr[numRows-1][i];
            arr[numRows-1][i] = temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

