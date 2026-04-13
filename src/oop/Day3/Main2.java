package oop.Day3;

public class Main2 {

    public static void main(String[] args) {

        Car car1 = new Car("Mercedes", "CLA", 2025, 280, false );
        Car car2 = new Car("BMW", "520d", 2024, 320, false );
        Car car3 = new Car("Audi", "A8", 2023, 300, false );

        car1.accelerate(100);
        System.out.println(car1);

        car2.accelerate(100);
        System.out.println(car2);




    }
}
