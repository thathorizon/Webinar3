package org.example;

public class Bike extends Vehicle {
    Bike() {
        super(2);
    }

    @Override
    public void drive() {
        System.out.println("Drive on Bike");
    }
}
