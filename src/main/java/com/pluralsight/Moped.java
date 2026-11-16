package com.pluralsight;

public class Moped extends Vehicle {

    public boolean hasPedals;

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean hasPedals) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.hasPedals = hasPedals;
    }

}
