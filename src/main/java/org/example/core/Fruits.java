package org.example.core;

public enum Fruits {

    APPLE(14, "Vitamin X"),
    ORANGE(15, "Iron"),
    MANGO(20, "Vitamin Z");

    private final int price;
    private final String source;

    Fruits(int price, String source) {
        this.price = price;
        this.source = source;
    }

    public int getPrice() {
        return price;
    }
}

//ACTIVE
//INACTIVE
//BLOCKED
