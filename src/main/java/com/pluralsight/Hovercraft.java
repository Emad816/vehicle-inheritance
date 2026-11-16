package com.pluralsight;

public class Hovercraft extends Vehicle {

    public int horsePower;

    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int horsePower) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.horsePower = horsePower;
    }
}

