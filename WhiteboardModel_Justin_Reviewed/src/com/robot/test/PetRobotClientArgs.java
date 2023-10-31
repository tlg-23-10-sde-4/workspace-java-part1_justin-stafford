package com.robot.test;

import com.robot.FoodType;
import com.robot.PetRobot;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * JR: flawed in several areas.
 *
 * Why is the string "com.entertainment.client.entertainment" in here?
 *
 * Bugs in usage banner.  Entire banner (as displayed in console) shown below these comments.
 *  - Example usage does not work, package name is wrong (see comment above re: "com.entertainment"),
 *    and the resulting PetRobot object looks like this:
 *      com.robot.PetRobot: petName= robZombie, petSize= small, allFood= null, energyIndex= 51, isHappy= true
 *    Note that "allFood= null", whereas the user specified "CHICKPEAS" if they ran the example usage.
 *  - Last line ("You can select") does not make sense. See JR: comment below.
 *    You probably meant to use PetRobot.VALID_PET_NAME[0]    ("robZombie") instead of
 *                              PetRobot.VALID_ZOMBIE_FOOD[0] ("CHICKPEAS").
 *    More careful examination of the output would have revealed all of these flaws.  Rushed at the end?
 *
 * Usage: java com.entertainment.client.entertainment.robots.com.robot.client.PetRobotClientArgs <petName> <petSize> <allFood>
 * Example: java com.entertainment.client.entertainment.robots.com.robot.client.PetRobotClientArgs robZombie small CHICKPEAS
 * Pet Name must be [robZombie, roboRapter, roboCat, roboDuck, roboSloth]
 * Pet Size must be [small, medium, large, gargantuan]
 *
 * JR: read this sentence carefully, it's clearly not what was intended.
 * You can select any of [RABBIT, FISH, CHICKPEAS, GRANOLA, AVOCADO, BUGS, LEAVES], unless you you select CHICKPEAS, he's a vegan and can only eat [CHICKPEAS, GRANOLA, AVOCADO]
 */
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

        // JR: unnecessary output
        System.out.println("You provided " + args.length + " arguments");

        String petName = args[0];
        String petSize = args[1];
        String allFood = args[2];

        // Check if the clients submitted pet name is "robZombie" and it's in his allowed list

        /*
         * JR: this would be better implemented in PetRobot's feed() method.
         * See comments above that method in PetRobot.
         */
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