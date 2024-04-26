import java.io.*;
import java.util.Scanner;
public class stringbuilder1 {
    public static void main(String args[])
    {
        try{
            Scanner sc=new Scanner(System.in);
            String str1=sc.nextLine();
            File obj=new File(str1);
            BufferedReader reader=new BufferedReader(new FileReader(obj));
            String line;
            StringBuilder content=new StringBuilder();
            while((line=reader.readLine())!=null)
            {
                System.out.println(line);
                content.append(line);
            }
            content.replace(6,6+4,"when ");
            reader.close();
            BufferedWriter writer=new BufferedWriter(new FileWriter(obj));
            String str2=content.toString();
            writer.write(str2);
            writer.close();
            sc.close();
        }
        catch(IOException e)
        {
            System.out.println("File doesn't exist");
        }
}
}