import java.util.*;
public class arraylist3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String arr1[]=sc.nextLine().trim().split(" ");
        ArrayList<Integer> aList=new ArrayList<>();
        for(String i : arr1)
        {
            if(i.matches("-?[0-9]+"))
            {
                aList.add(Integer.parseInt(i));
            }
        }
        String str2[]=sc.nextLine().trim().split(" ");
        int num1=Integer.parseInt(str2[0]);
        int num2=Integer.parseInt(str2[1]);
        int length=aList.size();
        if(num1<0 || num2>length)
        {
            System.out.println("Invalid indices");
        }else{
        for(int i=num1;i<=num2;i++)
        {
            System.out.print(aList.get(i));
            if(!aList.isEmpty())
            {
                System.out.print(" ");
            }
        }
    }
    }
}
