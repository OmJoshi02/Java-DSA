import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //ArrayList -> concrete class

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        list.add(49);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(100);
        list2.add(200);

        list.addAll(list2);

        System.out.println(list);


        list.removeAll(list2);
        System.out.println(list);

        System.out.println(list.size());

        list2.clear();
        System.out.println(list2.size());


        //I want to traverse array using iterator()

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println("Element : "+iterator.next());
        }

        ArrayList<Integer> list3 = new ArrayList<>();

        list3.add(1);
        list3.add(2);
        list3.add(3);

        System.out.println(list3.get(1));

        list3.set(0, 3000);
        System.out.println(list3);

        //toArray()

        Object[] arr = list3.toArray();

        for(Object obj : arr){
            System.out.println(obj);
        }

        ArrayList<Integer> list4 = new ArrayList<>();

        list4.add(5);
        list4.add(4);

        Collections.sort(list);
        System.out.println(list);
    }
}