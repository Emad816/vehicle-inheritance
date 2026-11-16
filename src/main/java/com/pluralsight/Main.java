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

        System.out.printf("\nCar color: " + car.getColor() +
                "\nCar seats: " + car.getNumberOfPassengers());

        //testing semi truck class
        SemiTruck truck = new SemiTruck();
        truck.setCargoCapacity(120);
        truck.setColor("green");

        System.out.printf("\nsemi truck color: " + truck.getColor()+
                "\nsemi truck cargo capacity: " + truck.getCargoCapacity());

        //testing hovercraft class
        Hovercraft niko = new Hovercraft();
        niko.setNumberOfPassengers(8);
        niko.setColor("navy blue");

        System.out.printf("\nhovercraft seats: " + niko.getNumberOfPassengers() +
                "\nhovercraft color: " + niko.getColor());
    }
}
