package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        //testing moped class
        Moped slowRide = new Moped();
        slowRide.setColor("Black");
        slowRide.setFuelCapacity(10);

        System.out.printf("slow ride color: " + slowRide.getColor() +
                "\nslow ride fuel capacity: " + slowRide.getFuelCapacity());

        //testing car class
        Car car = new Car();
        car.setColor("Red");
        car.setNumberOfPassengers(4);

        System.out.printf("Car color: " + car.getColor()"\n" +
                "Car seats: " + car.getNumberOfPassengers());

        //testing semi truck class
    }
}
