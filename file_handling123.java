import java.util.Scanner;

public class file_handling123 {
    public static void main(String args[]) {
        try{
            Scanner sc=new Scanner(System.in);
            int num1=sc.nextInt();
            String arr[] =new String[num1];
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=sc.next();
            } 
            int num2=sc.nextInt();
            sc.nextLine();
            if(num2<=num1)
            {
                System.out.println(arr[num2]);
            }
            else{

                throw new ArrayIndexOutOfBoundsException();
            }

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: Plant not found");
        }
    }
}
