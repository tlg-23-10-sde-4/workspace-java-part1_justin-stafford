package com.robot;


    public enum FoodType {
        RABBIT(42),
        FISH(20),
        CHICKPEAS(51),
        GRANOLA(15),
        AVOCADO(20),
        BUGS(10),
        LEAVES(2);

        // instance variable for enum com.robot.FoodType: allows delivery of the enum constants
        private final int foodValue;

        // Constructor used to initialize the enum constants
        FoodType(int foodValue) {
            this.foodValue = foodValue;
        }
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

        // Method to get energy value from different food types
        public int getFoodValue() {
            return foodValue;
        }
}
