import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(12);
        queue.offer(34);
        queue.offer(54);
        queue.offer(98);
        System.out.println(queue);

        System.out.println(queue.poll());

    }
}
