package org.example.inheritance;

import java.util.List;

public class Car {

    private List<String> wheels;
    private String brakes;
    private String color;
    private String engine;
    public String steeringWheel;
    private int cost;

    public Car(String brakes, String color, String engine) {
        this.brakes = brakes;
        this.color = color;
        this.engine = engine;
    }

    public void pushBrakes(){
        System.out.println("Brakes: ");
    }

    public String getBrakes() {
        return brakes;
    }

    private void setBrakes(String brakes) {
        this.brakes = brakes;
    }



}
