package org.example.ooptask;

public interface Animal {
    //void eat();
    void sleep();

    static void eat(){
        System.out.println("I will eat");
    }

    default void setEyes(){
        System.out.println("I will set eyes");
    }

}
