import java.util.LinkedList;
import java.util.List;

public class LL {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        System.out.println(list.indexOf(40));

        list.add(20);

        System.out.println(list.lastIndexOf(20)); //5

        LinkedList<Integer> ll = new LinkedList<>();

        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addFirst(50);
        ll.addLast(10);
        System.out.println(ll);

        System.out.println(ll.peek()); //starting element

        System.out.println(ll.poll()); //return first element and remove it
        System.out.println(ll);


    }
}
