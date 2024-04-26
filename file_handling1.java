import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class file_handling1 {
    public static void main(String args[])
    {
        try{
            Scanner sc=new Scanner(System.in);
            String str1=sc.nextLine();
            File obj=new File(str1);
            BufferedReader reader=new BufferedReader(new FileReader(obj));
            String line=reader.readLine();
            String arr[]=line.split(" ");
            double sum=0;
            int length=arr.length;
            int arr2[]=new int[length];
            for(int i=0;i<length;i++)
            {
                arr2[i]=Integer.parseInt(arr[i]);
                sum=sum+arr2[i];
            }
            double avg=sum/length;
            System.out.printf("Average Grade: %.2f",avg);
            int max1=arr2[0];
            int min1=arr2[0];
            for(int i=0;i<length;i++)
            {
                if(arr2[i]>max1)
                {
                    max1=arr2[i];
                }
                if(arr2[i]<min1)
                {
                    min1=arr2[i];
                }
            }
            System.out.println();
            System.out.println("Highest Grade: "+max1);
            System.out.println("Lowest Grade: "+min1);
            reader.close();
        }catch(IOException e)
        {
            System.out.println("File doesn't exist");
        }
    }
}
