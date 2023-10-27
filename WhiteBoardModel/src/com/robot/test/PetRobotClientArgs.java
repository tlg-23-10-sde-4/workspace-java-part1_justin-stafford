package com.robot.test;

import com.robot.FoodType;
import com.robot.PetRobot;

import java.util.Arrays;

class PetRobotClientArgs {

    public static void main(String[] args) {

        // check for the required 3 arguments
        if (args.length < 3) {
            String usage = "Usage: java com.entertainment.client.entertainment.robots.com.robot.client.PetRobotClientArgs <petName> <petSize> <allFood>";
            String example = "Example: java com.entertainment.client.entertainment.robots.com.robot.client.PetRobotClientArgs robZombie small CHICKPEAS";
            String note1 = String.format("Pet Name must be %s", Arrays.toString(PetRobot.VALID_PET_NAME));
            String note2 = String.format("Pet Size must be %s", Arrays.toString(PetRobot.ALL_SIZE));
            String note3 = String.format("You can select any of %s, unless you you select %s, he's a vegan and can only eat %s",
                    (Arrays.toString(PetRobot.ALL_FOODS)), (PetRobot.VALID_ZOMBIE_FOOD[0]), new PetRobot().getZombieFood());

            System.out.println(usage);
            System.out.println(example);
            System.out.println(note1);
            System.out.println(note2);
            System.out.println(note3);
            return;
        }

        System.out.println("You provided " + args.length + " arguments");

        String petName = args[0];
        String petSize = args[1];
        String allFood = args[2];

        // Check if the clients submitted pet name is "robZombie" and it's in his allowed list
        if (petName.equals("robZombie") && !PetRobot.isValidZombieFood(allFood)) {
            System.out.printf("robZombie cannot eat: %s . Please select one of %s.\n",
                    allFood, Arrays.toString(PetRobot.VALID_ZOMBIE_FOOD));
            return;
        }

        PetRobot myRobot = new PetRobot(petName, petSize);

        // need to take commandline input and convert allFood to FoodType, since that's what I'm using in my enum class.
        // then send it to my feed() method.
        FoodType foodType = FoodType.fromString(allFood);
        if (foodType == null) {
            System.out.println("You did follow directions with: " + allFood);
            return;
        }
        // need to feed the robot
        myRobot.feed(foodType);

        System.out.println("Your pet robot is ready to roll:");
        System.out.println(myRobot);
    }

}