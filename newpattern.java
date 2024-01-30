public class newpattern {
    public static void main(String args[])
    {
        for(int i=0;i<5;i++)
        {
            for(int j=5;j>i;j--)
            {
                System.out.print("*");
            }
            for(int k=0;k<(2*i);k++)
            {
                System.out.print(" ");
            }
            for(int j=5;j>i;j--)
            {
                    System.out.print("*");
            }
            if(i!=4)
            {
                System.out.print("\n");
            }
        }
           
        for(int l=0;l<=5;l++)
        {
            for(int m=0;m<l;m++)
            {
                System.out.print("*");
            }
            for(int n=5;n>l;n--)
            {
                System.out.print(" ");
            }
            for(int n=5;n>l;n--)
            {
                System.out.print(" ");
            }
            for(int m=0;m<l;m++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
        
    
    }
    
}
