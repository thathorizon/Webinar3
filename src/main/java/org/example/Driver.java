package org.example;

public class Driver {

    public void drive(Vehicle vehicle) {
        System.out.println("Today I'm:");

        if (vehicle instanceof Car) {
            vehicle.drive();

        } else if (vehicle instanceof Bike) {
            Bike bike = (Bike) vehicle;
            bike.drive();


        } else if (vehicle instanceof SuperCar) {
            ((SuperCar) vehicle).driveFast();
        }
    }
}
