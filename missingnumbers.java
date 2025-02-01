public class missingnumbers {
    public static int findMissingnumber(int[] arr)
    {
        int n=arr.length;
        int expectedSum=(n+1)*(n+2)/2;
        int actualSum=0;
        for(int i : arr)
        {
            actualSum+=i;
        }
        return expectedSum-actualSum;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,8,9};
        int missingnum=findMissingnumber(arr);
        System.out.println("Missing number is : "+missingnum);
        
    }
}
