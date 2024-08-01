package org.example.task2;

public class TestOperation {

    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        String operation = "+";

        Operation addition = new AdditionOperation(a, b);
        System.out.println(addition.operate());
    }
}
