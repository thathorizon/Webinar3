package org.example;

abstract class Vehicle {
    private int wheelCount;
    private String numberPlate; //номерной знак

    Vehicle(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public abstract void drive() ;

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public void setNumberPlate(int numberPlate) {
        this.numberPlate = String.valueOf(numberPlate);
    }

    public void setNumberPlate(Integer numberPlate) {
        this.numberPlate = String.valueOf(numberPlate);
    }


    public int getWheelCount() {
        return wheelCount;
    }
}
