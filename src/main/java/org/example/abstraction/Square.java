package org.example.abstraction;

public class Square extends Quadilateral {

    private int length;

    public Square(int length) {
        super(length, length);
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("I will draw a square");
    }

    public int getArea() {
        return length * length;
    }

    public static int getAllSides(){
        return 4;
    }

}
