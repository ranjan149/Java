package org.example.multithreading;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;

public class FirstThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        File file = new File("./");
    }

}


//I/O -> Input/Output
//Collections -> List (array), LinkedList(array), Set(array with no duplicate), Map(Key, value pair)
//Swing
//git(version control)
//calculator app with swing
//db query
//db connection with java
//spring boot and hibernate
//crud project with spring boot, thymeleaf and hibernate (db mysql)

