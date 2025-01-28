// Sample Question on HashSet in Java
// 💡 Question:
// Write a Java program that reads a list of integers from the user, stores them in a HashSet, and then prints the unique numbers in sorted order.

// 💡 Constraints:

// The program should accept space-separated integers as input.
// The output should display unique numbers in ascending order.

import java.util.HashSet;
import java.util.Collections;
import java.util.*;

public class hashset_qn {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> numbers=new HashSet<>();
        System.out.println("Enter space-seperated integers: ");
        String[] input=sc.nextLine().split(" ");
        
        for(String num : input)
        {
            numbers.add(Integer.parseInt(num));
        }
        System.out.println("\nUnordered Arrangement in HashSet: ");
        for(int num: numbers)
        {
            System.out.print(num+" ");
        }
        
        List<Integer> sortedList=new ArrayList<>(numbers);
        Collections.sort(sortedList);
        System.out.println("\n\nIntegers in the sorted order: \n"+sortedList);
        sc.close();



    }
}
