package com.entertainment.client;

import com.entertainment.Television;

public class TelevisionValidationTest {

    public static void main(String[] args) {
        // instance variable of television
        Television tv = new Television();

        // testing valid volume values
        tv.setVolume(0); // should stick
        tv.setVolume(100); // should stick
        System.out.println("the volume is: " + tv.getVolume()); // volume should be 0
        System.out.println(); // for readability
        tv.setVolume(-1); // error message, volume is invalid
        tv.setVolume(101); // error message, volume is invalid
        System.out.println("Error: The volume is: " + tv.getVolume()+ " needs to be between 1 - 100"); // should still have volume 100

        Television tv2 = new Television("Samsung", -1); // error message

        // Testing my brand values
        tv.setBrand("Samsung"); // should stick
        System.out.println("The brand is: " + tv.getBrand()); // brand should be Samsung

        tv.setBrand("LG"); // should stick
        System.out.println("The brand is: " + tv.getBrand()); //brand should be LG

        tv.setBrand("Sony"); // should stick
        System.out.println("The brand is: " + tv.getBrand()); // brand should be Sony

        tv.setBrand("Toshiba"); // should stick
        System.out.println("The brand is: " + tv.getBrand()); // brand should be Toshiba

        // Test invalid brand value
        tv.setBrand("INVALID"); // error message, brand not set

        // The brand should still have the previous value (Toshiba) from before
        System.out.println(tv); // should still be Toshiba, from before
    }
}

