import java.io.*;
import java.util.*;
public class prime_fh {
    public static void main(String[] args) {
        File file1 = new File("prime1.txt");
        File file2 = new File("prime2.txt");
        try{
            ArrayList<Integer> totalList = new ArrayList<>();
            StringBuilder content = new StringBuilder();
            BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            String line;
            while((line=reader1.readLine())!=null)
            {
                content.append(line+" ");
            }
            String firststr = content.toString();
            String arrFirst[] = firststr.split(" ");
            for(String word : arrFirst)
            {
                int val = Integer.parseInt(word);
                totalList.add(val);
            }
            reader1.close();
            BufferedReader reader2 = new BufferedReader(new FileReader(file2));
            line = reader2.readLine();
            String arrSecond[] = line.split(",");
            reader2.close();
            for(String word : arrSecond)
            {
                int val = Integer.parseInt(word);
                totalList.add(val);
            }
            for(int val : totalList)
            {
                System.out.println(val);
            }

        }
        catch(IOException e)
        {
            System.out.println("file not found");
        }
    }
}
