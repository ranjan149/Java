package org.example.collections;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListComparator implements Comparator<ArrayList<Integer>> {

    @Override
    public int compare(ArrayList arrayList1, ArrayList arrayList2) {
        return Integer.compare(arrayList1.size(), arrayList2.size());
        /*
        if(o1.size() > o2.size()) {
            return 1;
        } else if(o1.size() < o2.size()) {
            return -1;
        } else {
            return 0;
        }
        */
        //return (o1 < 02 ? -1 : ((o1 == o2) ? 0 : 1);

    }

}
