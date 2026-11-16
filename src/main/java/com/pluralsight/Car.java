package com.pluralsight;

public class Car extends Vehicle {

    public int vinNum;

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int vinNum) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.vinNum = vinNum;
    }
}
