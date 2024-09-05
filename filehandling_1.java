import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class filehandling_1 {
    public static void main(String[] args)
    {
        try{
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        File file1=new File(str1);
        BufferedReader reader=new BufferedReader(new FileReader(file1));
        ArrayList<Integer> aList=new ArrayList<>();
        String line;
        line=reader.readLine();
        String arr1[]=line.split(" ");
        for(String i : arr1)
        {
            int val=Integer.parseInt(i);
            aList.add(val);
        }
        System.out.println(aList);
        double sum=0;
        for(int i : aList)
        {
            sum=sum+i;
        }
        double avg=sum/aList.size();
        int max=0;
        int min=1000;
        for(int i : aList)
        {
            if(i<min)
            {
                min=i;
            }
            if(i>max)
            {
                max=i;
            }
        }
        System.out.printf("Average Grade: %.1f\n",avg);
        System.out.println("Highest Grade: "+max);
        System.out.println("Lowest Grade: "+min);
        reader.close();
        }catch(IOException e)
        {
            System.out.println("File not found");
        }

    }
}
