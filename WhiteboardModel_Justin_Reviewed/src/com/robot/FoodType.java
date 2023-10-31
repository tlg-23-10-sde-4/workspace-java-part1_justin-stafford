package com.robot;

/**
 * JR: nice use of advanced enum type.
 * Better class name = Food.
 *
 * See my comments throughout.
 *
 * Formatting (tabbing) is off, the whole class definition needs to shift left.
 * Ctrl+Alt+L will do this for you.
 */
    public enum FoodType {
        RABBIT(42),
        FISH(20),
        CHICKPEAS(51),
        GRANOLA(15),
        AVOCADO(20),
        BUGS(10),
        LEAVES(2);

        // instance variable for enum com.robot.FoodType: allows delivery of the enum constants
        // JR: better name = energyValue, since that's what it means in PetRobot objects
        private final int foodValue;

        // Constructor used to initialize the enum constants
        FoodType(int foodValue) {
            this.foodValue = foodValue;
        }

        public static FoodType valueOfIgnoreCase(String foodType) {
            return valueOf(foodType.toUpperCase());
        }

        /*
         * JR: good idea, but could be much simpler.
         * You could leverage the static valueOf() method available in all enum types.
         * See my take on this above.
         */
        // fromString method and .equalsIgnorecase from pg 175.
        // this methods comes over from PetRobotClientArgs to convert allFood
        public static  FoodType fromString(String allFood) {
            // now iterate through enums since I have a food item linked to a number.
            for (FoodType foodType : FoodType.values()) {
                if (foodType.name().equalsIgnoreCase(allFood)) {
                    return foodType;
                }
            }
            return null;
        }

        // JR: this comment even suggests that 'energyValue' would be a better name
        // Method to get energy value from different food types
        public int getFoodValue() {
            return foodValue;
        }
}
