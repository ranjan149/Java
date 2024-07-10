package org.example.abstraction;

public class Rectangle extends Quadilateral{

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        super(height, width);
    }

    @Override
    public void draw() {
        System.out.println("I will draw a rectangle");
    }

    @Override
    public int getArea() {
        return width * height;
    }

}
