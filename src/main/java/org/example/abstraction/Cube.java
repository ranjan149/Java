package org.example.abstraction;

public class Cube {

    private final Shape shape;

    public Cube(Shape shape) {
        this.shape = shape;
    }

    public void drawCube() {
        shape.draw();
    }
}
