import java.util.*;
public class arraylist2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String arr[]=sc.nextLine().trim().split(" ");
        ArrayList<String> aList=new ArrayList<>();
        for(String i : arr)
        {
            if(i.matches("[a-zA-Z]+"))
            {
                aList.add(i);
            }
        }
        System.out.println(aList);
        int max=aList.get(0).length();
        for(String i : aList)
        {
            if(i.length()>max)
            {
                max=i.length();
                
            }
        }
        for(String i : aList)
        {
            if(i.length()==max)
            {
                System.out.print(i);
            }
            if(!aList.isEmpty()){
                System.out.print(" ");
            }
        }
    }
}
