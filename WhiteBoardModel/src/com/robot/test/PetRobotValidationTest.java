package com.robot.test;

import com.robot.PetRobot;

class PetRobotValidationTest {
    public static void main(String[] args) {
        PetRobot pet = new PetRobot();

        pet.setEnergyIndex(0);                                                    // should stick
        System.out.println("Power: " + pet.getEnergyIndex());                     // should be 0

        pet.setEnergyIndex(100);                                                   // should stick
        System.out.println("Power: " + pet.getEnergyIndex());                     // should be 10

        pet.setEnergyIndex(-1);                                                   // error message -1 rejected
        System.out.println("Power: " + pet.getEnergyIndex());                     // not sure

        pet.setEnergyIndex(101);                                                   // error message 11 rejected
        System.out.println("Power: " + pet.getEnergyIndex());                     // not sure

    }
}
