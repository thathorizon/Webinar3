package org.example;

public class SuperCar extends Vehicle {

    SuperCar() {
        super(4);
    }

    public void driveFast() {
        System.out.println("Drive fast on car");
    }

    @Override
    public void drive() {

    }
}
