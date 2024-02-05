
//print border elements

// public class multidimensional_array {
//     public static void main(String[] args)
//     {
//         int arr[][]={{1,2,3},{4,5,6},{7,8,9},{0,6,1}};
//         for(int row=0;row<arr.length;row++)
//         {
//             for(int column=0;column<arr[0].length;column++)
//             {
//                 if(row==0||row==arr.length-1||column==0||column==arr[0].length-1){
//                 System.out.print(arr[row][column]+" ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


//print all the elements below diagonal elements
// public class multidimensional_array {
//     public static void main(String[] args)
//     {
//         int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
//         for(int row=0;row<arr.length;row++)
//         {
//             for(int column=0;column<arr[0].length;column++)
//             {
//                 if(row>=column)
//                 {
//                     System.out.print(arr[row][column]+" ");
//                 }
               
    
//             }
//             System.out.println();
//         }
//     }
// }



//print even elements
// public class multidimensional_array {
//     public static void main(String[] args)
//     {
//         int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
//         for(int row=0;row<arr.length;row++)
//         {
//             for(int column=0;column<arr[0].length;column++)
//             {
//                if(arr[row][column]%2==0)
//                 {
//                     System.out.print(arr[row][column]+" ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
    
//             }
//             System.out.println();
//         }
//     }
// }


//swap first row with last row of the array
//replace all the negative elements of an array with 0
//find the maximum element in the array and print
//sum of each row in an array,columns,diagonals


//replace all the negative elements of an array with 0
// public class multidimensional_array {
//     public static void main(String[] args)
//     {
//         int arr[][]={{1,2,-3},{-4,5,6},{7,-8,9}};
//        for(int row=0;row<arr.length;row++)
//        {
//         for(int column=0;column<arr[0].length;column++)
//         {
//             if(arr[row][column]<0)
//             {
//                 System.out.print(0+" ");
//             }
//             else
//             {
//                 System.out.print(arr[row][column]+" ");
//             }
//         }
//         System.out.println();
//        }
//     }
// }



// sum of each row in an array
// public class multidimensional_array {
//     public static void main(String[] args)
//     {
//         int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
//         int sum=0;
//        for(int row=0;row<arr.length;row++)
//        {
//         for(int column=0;column<arr[0].length;column++)
//         {
//             sum=sum+arr[row][column];    
//         }
//         System.out.print("Sum of each row "+sum);
//         sum=0;
//         System.out.println();
//        }
//     }
// }


//find the maximum element in the array and print
// public class multidimensional_array {
//     public static void main(String[] args)
//     {
//         int arr[][]={{11,2,3},{4,5,6},{7,8,9}};
//         int a=arr[0][0];
//         int max_element=0;
//        for(int row=0;row<arr.length;row++)
//        {
//         for(int column=0;column<arr[0].length;column++)
//         {
//             if(a<arr[row][column])
//             {
//                 max_element=arr[row][column];
//             }
//             else{
//                 max_element=a;
//             }         
//         }
//        }
//        System.out.print("Largest number in array "+ max_element);
//     }
// }



//swap first row with last row of the array
// public class multidimensional_array{
//     public static void main(String[] args)
//     {
//         int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
//         for(int row=0;row<arr.length;row++)
//         {
//             for(int column=0;column<arr[0].length;column++)
//             {
//                 int temp=arr[0][column];
//                 arr[0][column]=arr[arr.length-1][column];
//                 arr[arr.length-1][column]=temp;
//                 if(row==0||row==arr.length-1)
//                 {
//                     System.out.print(arr[row][column]+" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



//sum of columns

// public class multidimensional_array {
//     public static void main(String[]args)
//     {       
//         int arr[][] = {
//             { -1, 2, 3}, // first row
//             { 4, 5, 6 }, // second row
//             { 7, -8, 9},// third row
//             };
//         int sum=0;
//             for(int column=0;column<arr[0].length;column++)
//             {
//                 for(int row=0;row<arr.length;row++)
//                 {
                    
//                     sum=sum+arr[row][column];
//                 }
//                 System.out.println("Sum of column "+column+" = "+sum);
//                 sum=0;
//             }
//             System.out.println();
//     }
// }