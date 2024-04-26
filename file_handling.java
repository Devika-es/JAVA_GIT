import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file_handling
{
    public static void main(String args[])
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            File obj=new File(str);
            BufferedReader reader=new BufferedReader(new FileReader(obj));
            String line;
            while((line=reader.readLine())!=null)
            {
                System.out.println(line);
            }
            reader.close();
            BufferedWriter writer=new BufferedWriter(new FileWriter(obj));
            writer.write("Enne patichan patula");
            writer.close();

        }
        catch(IOException e)
        {
            System.out.println("File not found");
        }
    }
}