import java.util.HashSet;
public class hashset {
    public static void main(String[] args)
    {
        HashSet<Integer> integers= new HashSet<>();
        integers.add(11);
        integers.add(14);
        integers.add(19);
        integers.add(1);
        integers.add(10);
        integers.add(12);
        integers.add(11);
        for(int num: integers)
        {
            System.out.println(num);
        }


    }
    
}
