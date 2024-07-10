package org.example.multithreading;

public class ThreadX {

    public void runMultipleThread() {
        Runnable newThread = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("I will wait");
                    System.out.println(Thread.currentThread().getName() + ": " + i);

                }
            }
        };
        Thread newThreadClass = new Thread(newThread);
        newThreadClass.setName("New Thread");
        newThreadClass.start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("I will wait");
            }
        }).start();
    }

}
