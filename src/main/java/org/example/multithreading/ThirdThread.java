package org.example.multithreading;

public class ThirdThread extends Thread {

    private Object object;

    public ThirdThread(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        synchronized (object) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Third Thread: " + i);
            }
            object.notify();
        }

    }
}
