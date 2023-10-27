import com.entertainment.DisplayType;
import com.entertainment.Television;

import java.util.Arrays;

class TelevisionClientArgs {

    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {
            printUsage();
            return;  // early return from main(), application exits
        }

        //1: convert strings to proper types
        String brand = null;
        int volume = 0;
        DisplayType display = null;

        try {
            brand = args[0];
            volume = Integer.parseInt(args[1]);
            display = DisplayType.valueOf(args[2].toUpperCase());

        } catch (IllegalArgumentException e) {
            System.out.println("There is a problem with your input: ");
            System.out.printf("You entered: %s, %sm %s\n\n", args[0], args[1], args[2]);
            printUsage();
            return;
        }

        try {
            // step 2: create a com.entertainment.Television
            Television tv = new Television(brand, volume, display);

            // Step 3: Congratule them on their order and show the television
            System.out.println("Congratulations on your order, it will be there soon");
            System.out.println(tv);  // toString()

        } catch (Exception e) {
            System.out.println(e.getMessage() + "\n");
            printUsage();
        }
    }

    private static void printUsage() {
        String usage = "Usage: java com.entertainment.client.TelevisionClientArgs <brand> <volume> <display>";
        String example = "Example: java com.entertainment.client.TelevisionClientArgs Samsung 32 PLASMA";
        String note1 = String.format("Brand must be %s", Arrays.toString(Television.VALID_BRANDS));
        String note2 = String.format("Volume must be %s to %s", Television.MIN_VOLUME, Television.MAX_VOLUME);
        String note3 = "Note: supported displays are " + Arrays.toString(DisplayType.values());
        System.out.println(note1);
        System.out.println(note2);
        System.out.println(note3);
    }
}