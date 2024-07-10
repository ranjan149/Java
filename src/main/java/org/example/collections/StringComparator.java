package org.example.collections;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String string1, String string2) {
        if(string1.isEmpty()) {
            return -1;
        } else if (string2.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }
}
