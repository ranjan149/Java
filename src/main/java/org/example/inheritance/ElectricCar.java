package org.example.inheritance;

public class ElectricCar extends Car implements Vechicle, Machine{

    private int cost;

    public ElectricCar(String brakes, String color, String engine, int cost) {
        super(brakes, color, engine);
        this.cost = cost;
    }

    public String getElectricCarBrakes(String parts){
        if(parts.isEmpty()){
            return getBrakes();
        } else {
            return getBrakes(parts);
        }
    }

    public String geStringWheel(){
        return steeringWheel;
    }

    public int getCost(){
        return cost;
    }

    @Override
    public String getBrakes(){
        return "BRAKES";
        //return super.getBrakes();
    }

    public String getBrakes(String parts){
        String brakes = super.getBrakes();
        brakes = brakes + parts;
        return brakes;
    }

    @Override
    public void run() {
    }
}
