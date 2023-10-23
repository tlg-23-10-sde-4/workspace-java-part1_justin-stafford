package gov.test;

class WrappersTest {

    public static void main(String[] args) {
        String ageInput = "50";
        int age = Integer.parseInt(ageInput);
        Integer ageInteger = Integer.valueOf(ageInput);

        String brainCellsInput = "8600000000";
        long brainCells = Long.parseLong(brainCellsInput);
        Long brainCellsLong = Long.valueOf(brainCellsInput);

        String shoeSizeInput = "9.5";
        double shoeSize = Double.parseDouble(shoeSizeInput);
        Double shoeSizeDouble = Double.valueOf(shoeSizeInput);

        String sunnyInput = "true";
        boolean sunny = Boolean.parseBoolean(sunnyInput);
        Boolean sunnyBoolean = Boolean.valueOf(sunnyInput);

        Integer size = 9;
    }
}