package org.example.abstraction;

public abstract class Quadilateral implements Shape {

    private int length;
    private int width;

    public Quadilateral(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getPerimeter(){
        int perimeter = 2 * (length + width);
        return perimeter;
    }

    public abstract int getArea();

    public static int getSides(){
        return 4;
    }

}
