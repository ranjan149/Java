package org.example.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {
        TreeMap<String, Set<String>> treeMap = new TreeMap<>(new StringComparator());

        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");

        Set<String> set1 = new HashSet<>();
        set1.add("C");
        set1.add("D");

        treeMap.put("1", set1);
        treeMap.put("", set);
        treeMap.put("2", set);
        System.out.println("GET: " + treeMap.get("1"));
        System.out.println("First Entry : " +treeMap.firstEntry());
        System.out.println("Last Entry : " +treeMap.lastEntry());
        System.out.println();
    }
}
