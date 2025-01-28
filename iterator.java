import java.util.HashSet;
import java.util.*;
public class iterator {
    public static void main(String[] args)
    {
        HashSet<Integer> numbers=new HashSet<>();
        numbers.add(23);
        numbers.add(13);
        numbers.add(12);
        numbers.add(9);
        numbers.add(65);
        numbers.add(43);

        Iterator<Integer> iterator=numbers.iterator();
        while(iterator.hasNext())
        {
            int num=iterator.next();
            if(num==12)
            {
                iterator.remove();
            }
        }

        for(int num : numbers)
        {
            System.out.println(num);
        }


        

    }
}
