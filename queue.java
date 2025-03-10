import java.util.*;
public class queue {
    public static void main(String args[])
    {
        Queue<Double> queue=new LinkedList<>();
        queue.offer(4.5);
        queue.offer(5.6);
        queue.offer(9.5);
        queue.offer(8.7);
        queue.offer(3.6);
        while(!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }

    }
}
