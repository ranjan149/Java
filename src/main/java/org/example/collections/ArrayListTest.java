package org.example.collections;

import org.example.multithreading.ThreadX;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListTest {


    public static void main(String[] args) {
        addNumToIntegerArrayList();
    }

    public static void addNumToIntegerArrayList() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = arrayList;

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(3);

        arrayList.remove(1);
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.contains(2));
        System.out.println(arrayList.equals(arrayList1));
        System.out.println(arrayList.indexOf(3));

    }



}
