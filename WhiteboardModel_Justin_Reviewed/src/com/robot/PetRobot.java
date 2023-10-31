package com.robot;

import java.util.Arrays;

/**
 * JR: Demonstrates understanding of program concepts, but flawed in several areas,
 * and more attention to detail needed.  Some nice creativity applied, but not implemented
 * correctly, e.g., ClientArgs output clearly reveals its flaws.
 *
 * See comments below and in the other classes.
 *
 * Code is clean, readable, well-formatted: needs improvement (tabbing).
 *
 * Class participation has been good, keep it up!
 *
 * Class names, package names, and overall structure are not correct.
 *  - PetRobotClientArgs should be in package com.robot.client.
 *
 * Submission instructions not followed correctly.
 *  - Late (2:54pm PT Sat 10/21/2023).
 */
public class PetRobot {

    //  as advertised constants
    public static final int MIN_ENERGY = 0;
    public static final int MAX_ENERGY = 100;

    // JR: all of these would be better declared in ClientArgs, the only place they need to be used
    public static final String[] ALL_FOODS = {"RABBIT", "FISH", "CHICKPEAS", "GRANOLA", "AVOCADO", "BUGS", "LEAVES"};
    public static final String[] VALID_ZOMBIE_FOOD = {"CHICKPEAS", "GRANOLA", "AVOCADO"};
    public static final String[] VALID_PET_NAME = {"robZombie", "roboRapter", "roboCat", "roboDuck", "roboSloth"};
    public static final String[] ALL_SIZE = {"small", "medium", "large", "gargantuan"};

    // properties or attributes
    /*
     * JR: the only fields in here should be
     *  petName
     *  petSize
     *  energyIndex
     *  isHappy
     *  foods (array of what's been eaten already)
     *
     * The others are being used solely in ClientArgs, and would be better declared there.
     */

    private String petName;
    private String petSize;
    private String allFood;
    private String zombieFood;
    private int energyIndex = 0;  // JR: better name = energy
    private boolean isHappy = false;
    private FoodType[] foods = new FoodType[100]; // array to store food

    // JR: field should be private
    int foodIndex = 0; // index to track the last food entry

    // Methods
    // feed method to take enum constants and feed pets with specific food
    /*
     * JR: it appears that you have a business rule that PetRobots named "robZombie"
     * can only eat [CHICKPEAS, GRANOLA, AVOCADO].  Enforce that here, not in ClientArgs class.
     */
    public void feed(FoodType food) {
        if (foodIndex < 100) {
            this.foods[foodIndex++] = food; // add food to foods array & increments
            // make sure we don't break through MAX_ENERGY
            int newEnergy = getEnergyIndex() + food.getFoodValue();
            if (newEnergy > MAX_ENERGY) {
                newEnergy = MAX_ENERGY;
            }
            setEnergyIndex(newEnergy); // update pet's energy points
            System.out.println(petName + " is enjoying tasty " + food + " that contains " +
                    food.getFoodValue() + " energy points. " + petName + " now has " + getEnergyIndex() +
                    " energy points!");
            isHappy = true; // pet robot's happy you finally feed him/her

            // I handled this exception with the newEnergy > MAX_ENERGY above, so it negates the else.=> future Justin problem.
        } else {
            System.out.println(petName + " is full.  Go feed someone else.");
        }
    }

    public void sleep(String location) {
        System.out.println(petName + " is taking a well earned nap " + location + ".");
        isHappy = true;
    }

    /*
     * JR: this method could deplete energy, that would be a nice touch (not required).
     * Perhaps a Game enum, with each instance having an int property for the depletion.
     * It would be the inverse of FoodType.
     *  eat(FoodType) increases energy by the foodValue
     *  play(Game)    decreases energy by the depletionValue
     */
    public void play(String location) {
        System.out.println(petName + " is playing games" + location);
    }

    /*
     * JR: these should be located directly under the instance variables.
     */
    // Constructors
    public PetRobot() {
    }

    public PetRobot(String petName) {
        setPetName(petName);
    }

    public PetRobot(String petName, String petSize) {
        this(petName);
        setPetSize(petSize);
    }

    public PetRobot(String petName, String petSize, int energyIndex) {
        this(petName, petSize);
        setEnergyIndex(energyIndex);
    }

    public PetRobot(String petName, String petSize, int energyIndex, boolean isHappy) {
        this(petName, petSize, energyIndex);
        setHappy(isHappy);
    }

    // Getters and Setters
    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetSize() {
        return petSize;
    }

    public void setPetSize(String petSize) {
        this.petSize = petSize;
    }

    public String getAllFood() {
        return allFood;
    }

    public void setAllFood(String allFood) {
        this.allFood = allFood;
    }

    public String getZombieFood() {
        zombieFood = Arrays.toString(VALID_ZOMBIE_FOOD);
        return zombieFood;
    }

    // JR: seems unnecessary since you have the FoodType enum.
    public static boolean isValidZombieFood(String zombieFood) {
        boolean valid = false;
        for (String currentZombieFood : VALID_ZOMBIE_FOOD) {
            if (zombieFood.equals(currentZombieFood)) {
                valid = true;
                break;
            }
        }
        return valid;
    }

    public int getEnergyIndex() {
        return energyIndex;
    }

    public void setEnergyIndex(int energyIndex) {
        if (MIN_ENERGY <= energyIndex && energyIndex <= MAX_ENERGY) {
            this.energyIndex = energyIndex;
        } else {
            System.out.println("Invalid Energy Index of: " + energyIndex + ". Must be between " +
                    MIN_ENERGY + " and " + MAX_ENERGY + ".");
        }
    }

    public boolean isHappy() {
        return isHappy;
    }

    public void setHappy(boolean happy) {
        isHappy = happy;
    }

    public String toString() {
        return String.format("com.robot.PetRobot: petName= %s, petSize= %s, allFood= %s, energyIndex= %d, isHappy= %b",
                getPetName(), getPetSize(), getAllFood(), getEnergyIndex(), isHappy());
    }
}
