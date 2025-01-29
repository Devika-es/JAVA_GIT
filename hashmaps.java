// HashMap is a part of Java’s Collection Framework that stores key-value pairs. 
//It uses hashing to provide fast access (O(1) average time complexity) for operations like insertion, deletion, and retrieval.

// Key Features of HashMap
// ✅ Stores key-value pairs
// ✅ Allows one null key and multiple null values
// ✅ Does NOT maintain order (Use LinkedHashMap if needed)
// ✅ Fast performance (O(1) for basic operations)

import java.util.*;
public class hashmaps {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(1,"one");
        map.put(4,"four");
        map.remove(2);
        System.out.println(map);
    }
}
