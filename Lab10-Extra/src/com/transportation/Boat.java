package com.transportation;

public class Boat extends Vehicle {
    // INSTANCE VARIABLES

    // CONSTRUCTORS
    public Boat(String vin) {
        super(vin);

        // you subclassed an abstract class, so you can't call super()'
    }
    @Override
    // vehicle is an abstract class
    // gives subclasses the right to throw exception, but not the obligation
    // its part of the vehicle API
    public void moveTo(String location) {
        System.out.println("Boat moving to " + location);
    }
}
