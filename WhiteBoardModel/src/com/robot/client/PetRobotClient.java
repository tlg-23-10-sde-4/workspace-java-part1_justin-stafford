package com.robot.client;

import com.robot.FoodType;
import com.robot.PetRobot;

public class PetRobotClient {

    public static void main(String[] args) {

    PetRobot pet1 = new PetRobot("RobZombie", "small", 25);
    pet1.feed(FoodType.CHICKPEAS);

    System.out.println(); // blank line for readability

    // 2nd instance
    PetRobot pet2 = new PetRobot("RoboDuck", "medium", 5);
    pet2.feed(FoodType.BUGS);
    pet2.play(" in the lake.");

    System.out.println(); // blank line for readability

    // 3rd instance
    PetRobot pet3 = new PetRobot("RoboCat", "small", 5);
    pet3.feed(FoodType.FISH);
    pet3.sleep(" on my f*cking keyboard again");

    System.out.println(); // blank line for readability

    // 4th instance
    PetRobot pet4 = new PetRobot("RoboRaptor", "small", 26);
    pet4.feed(FoodType.RABBIT);
    pet4.play(" over the furry corpse of his latest meal.");

    System.out.println(); // blank line for readability

    // 5th instance
    PetRobot pet5 = new PetRobot("RoboSloth", "small", 2);
    pet5.feed(FoodType.LEAVES);
    pet5.sleep(" in a nicely shaded cecropia tree");

    System.out.println(); // for readability
    System.out.println(pet1.toString());
    System.out.println(pet2.toString());
    System.out.println(pet3.toString());
    System.out.println(pet4.toString());
    System.out.println(pet5.toString());
    }
}