package oop.Day3;

public class Car {

    String brand;
    String model;
    int year;
    double speed = 0;
    boolean isRunning;

    public Car(String brand, String model, int year, double speed, boolean isRunning) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.isRunning = isRunning;
    }

    void start(){
        isRunning = true;
    }

    void stop(){
        isRunning = false;
    }

    void accelerate(int amount){
        isRunning = true;
        this.speed += amount;
    }

    void brake(int amount){}

    @Override
    public String toString(){
        return "Brand : " + brand + "\n" + "Model : " + model  + "\n" +  "Year : " + year + "\n" + "Speed : " + speed + "\n" + "isRunning : " + isRunning;
    }

}
