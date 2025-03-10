import java.util.*;
public class priorityqueue {
    public static void main(String args[])
    {
        Queue<String> queue=new PriorityQueue<>(Collections.reverseOrder());
        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("G");
        queue.offer("Z");
        while(!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }


    }
}
