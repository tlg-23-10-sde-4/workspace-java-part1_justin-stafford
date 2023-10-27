package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS
    // OPTION 4: try-catch the exceptio, then trhow a different one.
    // Instead of re-throwing this low-level, transportion oriented exception
    //we'll throw a HR-oriented exceptoion more suitable for amy HR apllication client
    public void goToWork() throws WorkException {
        Car c = new Car("12345678", "Ford", "Mustang");

        try {
            c.start();
            c.moveTo("West Seattle");
        }
        catch (DestinationUnreachableException e) {
           throw new WorkException("Unable to get to work", e);  // e is the nested "cause" exception
        }
        finally {
            c.stop();
        }
    }



    // OPTION 3: catch the exception, respond, and then re-throw the exception.
    // NOTE: since we re-throw the exception, we are not handling it correctly, but we are "responding"
    // We still use finally for the guarantee call to stop()
    /*
    public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("12345678", "Ford", "Mustang");

        try {
            c.start();
            c.moveTo("West Seattle");
        }
        catch (DestinationUnreachableException e) {
            // use JavaMail API to send email to Lisa Herbold to complain
            throw e;
        }
        finally {
            c.stop();
        }
    }
*/
    // OPTION 2: try-catch and handle exceptions.  The exception stops here.
    // we use a try-finally here, to guarantee that stop() gets called
//    public void goToWork() throws DestinationUnreachableException {
//        Car c = new Car("12345678", "Ford", "Mustang");
//
//        try {
//            c.start();
//            c.moveTo("West Seattle");
//        }
//        finally {
//            c.stop();
//        }
//    }

   // OPTION 1: try-catch and handle exceptions.  The exception stops here.
    //
//    Car c = new Car("12345678", "Ford", "Mustang");
//        try {
//        c.start();
//        c.moveTo("West Seattle");
//
//    } catch (DestinationUnreachableException e) {
//        System.out.println(e.getMessage());
//    }
//         finally {
//        c.stop();
//
//    }
//        System.out.println("Arrived at work");
//}


    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}