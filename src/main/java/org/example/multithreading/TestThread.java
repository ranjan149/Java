package org.example.multithreading;

public class TestThread {

    public static void main(String[] args) throws InterruptedException {
        FirstThread thread = new FirstThread();
        thread.setPriority(5);
        thread.setName("First Thread");
        thread.start();


        System.out.println(thread.getName());

        SecondThread secondThread = new SecondThread();
        Thread thread2 = new Thread(secondThread);
        thread2.setPriority(6);
        thread2.setName("Second Thread");

        ThirdThread thirdThread = new ThirdThread("ABC");
        thirdThread.setName("Third Thread");
        thirdThread.setPriority(10);
        thirdThread.start();

        thirdThread.join();

        thread2.start();
    }
}
