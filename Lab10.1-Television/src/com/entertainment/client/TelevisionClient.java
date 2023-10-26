package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.InvalidBrandException;
import com.entertainment.Television;
import static com.entertainment.Television.*;
/*
* Application main-class, i.e., the class definition with the main() method.
* Purpose: create a few instances of com.entertainment.Television and give them a test-drive.
 */
class TelevisionClient {

    // application starting point - at runtime, the app start here
    public static void main(String[] args) throws InvalidBrandException {
        System.out.println(Television.getInstanceCount() + " instances created");
        System.out.println();  // for readability

        // create an instance of television and sets its properties
        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(Television.MAX_VOLUME);
        tv1.setDisplay(DisplayType.PLASMA);

        //create a 2nd instance of com.entertainment.Television via the brand-volume-display ctor

        System.out.println();  // for readability
        // create 2nd instances of television and sets its properties
        Television tv2 = new Television("Sony", 32);  //Television.MIN_VOLUME
        tv2.turnOn();
        tv2.turnOff();

        System.out.println(Television.getInstanceCount() + " instances created");
        System.out.println();  // for readability
        // create 3rd instance of television and sets its properties
        Television tv3 = new Television("LG", 50, DisplayType.LCD);
        // Method for turning the TV ON or OFF
        tv1.turnOn();
        tv1.turnOff();
        System.out.println(); // for readability
        tv2.turnOn();
        tv2.turnOff();
        System.out.println(); // for readability
        tv3.turnOn();
        tv3.turnOff();
        System.out.println(); // for readability

        // showing toString() methods
        System.out.println(tv1.toString());
        System.out.println(tv2.toString());
        System.out.println(tv3); // toString automatically called
        System.out.println(Television.getInstanceCount() + " instances created");
    }

}