package org.example;

public class Car extends Vehicle {

    Car() {
        super(4);
    }

    @Override
    public void drive() {
        System.out.println("Drive on Car");
    }
}
