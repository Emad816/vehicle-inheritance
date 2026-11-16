package com.pluralsight;

public class SemiTruck extends Car {
    public boolean hasTrailer;

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int vinNum, boolean hasTrailer) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, vinNum);
        this.hasTrailer = hasTrailer;
    }
}
