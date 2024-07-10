package org.example.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", null);

        System.out.println("Initial Value :" + map.get("a"));
        //System.out.println(map.remove("a"));
        System.out.println(map.containsKey("a"));
        System.out.println(map.containsValue(1));
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println("Values : " + map.values());
        System.out.println("Keys : " + map.keySet());

        map.put("a", 9);
        System.out.println("After Change :" + map.get("a"));
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
