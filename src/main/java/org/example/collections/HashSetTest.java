package org.example.collections;

import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        System.out.println("Size :" + set.size());
        System.out.println("Is empty :" + set.isEmpty());
    }
}
