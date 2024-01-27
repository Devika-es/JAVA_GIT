public class pattern4 {
    public static void main(String args[])
    {
        for(int i=5;i>=0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<5-i;k++)
            {       
            System.out.print("* ");
            }
            System.out.print("\n");
        }
        
    }
    
}
