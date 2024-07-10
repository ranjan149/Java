package org.example.collections;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.PriorityQueue;

public class QueueTest {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        PriorityQueue<ArrayList<Integer>> priorityQueue = new PriorityQueue<>(new ArrayListComparator());

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);


        priorityQueue.add(list2);
        priorityQueue.add(list3);
        priorityQueue.add(list1);

        ArrayListComparator comparator = new ArrayListComparator();
        comparator.compare(list1, list2);


        System.out.println("Poll :" + priorityQueue.poll());
        System.out.println("Size : " + priorityQueue.size());
        System.out.println("Peek : " + priorityQueue.peek());

        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] hashByte = messageDigest.digest("Hello World".getBytes());

    }
}
