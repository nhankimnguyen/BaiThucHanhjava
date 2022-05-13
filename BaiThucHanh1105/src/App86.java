import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App86 {
    public static void main(String[] args) {
        
        HashMap<String,String> hashmap = new HashMap<>();

        hashmap.put("CSLT", "Cơ Sơ Lập Trình");
        hashmap.put("C++", "C++");
        hashmap.put("C#", "C Sharp");
        hashmap.put("PHP", "PHP");
        hashmap.put("Java", "Java");

        Set<Map.Entry<String,String>> SetHashMap = hashmap.entrySet();

        System.out.println("Các entry có trong sethashmap : ");
        System.out.println(SetHashMap);

    }
}
