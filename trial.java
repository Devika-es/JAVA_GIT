
public class trial {
    public static void main(String[] args)
    {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9},{0,6,1}};
        for(int column=0; column<arr[0].length; column++) {
            System.out.print(arr[0][column]+" ");
        }
        System.out.println();
        for(int column=0; column<arr[0].length; column++) {
            System.out.print(arr[arr.length-1][column]+" ");
        }
        System.out.println();
    }
}
