import java.io.*;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class stringbuilder4{
    public static void main(String args[])
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            String str1=sc.nextLine();
            // String str2=sc.nextLine();
            File obj=new File(str1);
            BufferedReader reader=new BufferedReader(new FileReader(obj));
            String line;
            StringBuilder content=new StringBuilder();
            while((line=reader.readLine())!=null)
            {
                content.append(line+" ");
                
            }
            Map<Character,Integer> freqMap=new HashMap<>();
            char arr[]=content.toString().toCharArray();
            for(char word : arr)
            {
                if(!freqMap.containsKey(word))
                {
                    freqMap.put(word,1);
                }
                else{
                    int count=freqMap.get(word);
                    freqMap.put(word,count+1);
                }
            }
            reader.close();
             int maxFrequency=0;
             char maxstring=arr[0];
            for(Map.Entry<Character,Integer> entry : freqMap.entrySet())
            {
                char k=entry.getKey();
                int f=entry.getValue();
                if(f>maxFrequency)
                {
                    maxFrequency=f;
                    maxstring=k;
                }
                // if(entry.getKey().equals(str2))
                // {
                //     System.out.println(entry.getValue());
                // }
            }
            System.out.println(maxstring);

        }
        catch(IOException e)
        {
            System.out.println("File doesnt exists");
        }
    }
}
