// This version allows the user to enter space-separated integers, 
// removes duplicates while maintaining order, and prints the unique numbers.

import java.util.*;

public class linked_hashset {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the space-seperated integers: ");
        String[] input=sc.nextLine().split(" ");

        LinkedHashSet<Integer> numbers=new LinkedHashSet<>();
        for(String ch : input)
        {
            numbers.add(Integer.parseInt(ch));
        }
        System.out.println("Unique elements are: "+numbers);
        sc.close();
    }
}

