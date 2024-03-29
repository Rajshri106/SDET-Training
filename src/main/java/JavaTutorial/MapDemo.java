package JavaTutorial;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);
        System.out.println(map);//print element
        System.out.println(map.size());
        if (map.containsKey("a")) {
            Integer a = map.get("a");
            System.out.println("value of a is :" + a);
        }
        for (String key : map.keySet()) {
            System.out.println("key " + key + " value:" + map.get(key));
        }
    }
}