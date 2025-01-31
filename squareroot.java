public class squareroot{
    public static int findsqroot(int n)
    {
        if(n==0 || n==1)return n;
        int left=1,right=n,ans=0;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(mid*mid==n)
            {
                return mid;
            }
            else if(mid*mid<n)
            {
                ans=mid;
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int n=49;
        System.out.println("Square root of "+n+" is : "+findsqroot(n));
    }
}