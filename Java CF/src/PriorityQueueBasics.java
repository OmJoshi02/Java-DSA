import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasics {
    public static void main(String[] args) {

        Queue<Integer> q = new PriorityQueue<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println(q.poll() ); // 10 = Lowest value has highest priority
    }
}
