import java.util.*;
public class hashmap3 {
    public static void main(String args[]){
        HashMap<String,String> fruits=new HashMap<>();
        fruits.put("Devika","Mango");
        fruits.put("Devasagar","Orange");
        fruits.put("Divya","Guava");
        fruits.put("Sathyan","Jackfruit");
        Set<String> keys=fruits.keySet();
        for(String i : keys)
        {
            System.out.println(i+" : "+fruits.get(i));
        }
        // Set<Map.Entry<String,String>> values=fruits.entrySet();
        // for(Map.Entry<String,String> e : values)
        // {
        //     System.out.println(e.getKey()+" : "+e.getValue());
        // } 

    }

}
