import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(12);
        System.out.println(pq + " "+ pq.peek());
        pq.offer(15);
        System.out.println(pq + " "+ pq.peek());
        pq.offer(20);
        System.out.println(pq + " "+ pq.peek());
        pq.offer(1);
        System.out.println(pq + " "+ pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq + " "+ pq.peek());
    }
}
