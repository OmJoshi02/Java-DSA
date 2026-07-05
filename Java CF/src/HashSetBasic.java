import java.util.HashSet;
import java.util.Set;

public class HashSetBasic {
    public static void main(String[] args) {

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();


        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(40);

        s2.add(30);
        s2.add(40);
        s2.add(50);
        s2.add(60);

        s1.retainAll(s2);
        System.out.println(s1);
    }
}
