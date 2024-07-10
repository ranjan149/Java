package org.example.multithreading;

public class SecondThread implements Runnable {

    @Override
    public void run() {
        Object object = new Object();
        synchronized (object) {
            try {
                object.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Second Thread : " + i);
        }
    }
}
