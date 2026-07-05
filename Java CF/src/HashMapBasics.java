import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {
    public static void main(String[] args) {

        Map<String, String> mapping = new HashMap<>();

        mapping.put("In" , "India");
        mapping.put("US" , "USA");
        mapping.put("EN", "England");

        System.out.println(mapping);

        Map<String, String > m = new HashMap<>();

        m.put("BR" , "Brazil");

        System.out.println(m);

        m.putAll(mapping);

        System.out.println(m);

        m.remove("BR");
        System.out.println(m);

        m.putIfAbsent("NP" , "Nepal");

        System.out.println(m);
    }
}
