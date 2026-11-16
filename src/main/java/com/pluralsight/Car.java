package com.pluralsight;

public class Car extends Vehicle {

    public int vinNum;

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int vinNum) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.vinNum = vinNum;
    }

    public int getVinNum() {
        return vinNum;
    }

    public void setVinNum(int vinNum) {
        this.vinNum = vinNum;
    }
}
