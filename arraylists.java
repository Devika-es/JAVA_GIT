// ArrayList is a resizable array implementation of the List interface in Java. 
// Unlike arrays, ArrayList can grow and shrink dynamically.

// Key Features of ArrayList
// ✅ Dynamic resizing – Automatically resizes when elements are added/removed.
// ✅ Maintains insertion order – Elements stay in the order they were added.
// ✅ Allows duplicates & null values – Unlike HashSet, it allows repeated elements.
// ✅ Random access (O(1)) – Uses indexing for fast access.
// ✅ Slower for insertions/deletions (O(n)) – Shifting elements is required when adding/removing in the middle.

import java.util.*;

public class arraylists {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter space-seperated integers: ");
        String[] input=sc.nextLine().split(" ");

        ArrayList<Integer> list1=new ArrayList<>();
        for(String ch : input)
        {
            list1.add(Integer.parseInt(ch));
        }

        int max=Collections.max(list1);
        System.out.println("Largest element: "+max);
    }
}
