package org.example.task2;

public class AdditionOperation implements Operation {

    private double a;
    private double b;

    public AdditionOperation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double operate() {
        return a + b;
    }
}
