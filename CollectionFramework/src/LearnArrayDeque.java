import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq=new ArrayDeque<>();
        System.out.println(adq.peek());
        adq.offer(23);
        System.out.println(adq + " "+ adq.peek());
        adq.offer(8);
        System.out.println(adq + " "+ adq.peek());
        adq.offer(19);
        System.out.println(adq + " "+ adq.peek());
        adq.offer(44);
        System.out.println(adq + " "+ adq.peek());
        adq.offerFirst(12);
        System.out.println(adq + "    "+ adq.peek());
        adq.offerLast(8);
        System.out.println(adq + "    "+ adq.peek());
    }
}
