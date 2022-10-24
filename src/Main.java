import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        HashMap<String, Integer> items = new HashMap<>();
        items.put("key", 77);
        items.put("Sally", 97);
        items.put("Sally", items.getOrDefault("Sally",0) + 1);

        for (String key : items.keySet()) System.out.println(key);
        for (Integer value : items.values()) System.out.println(value);
    }
}