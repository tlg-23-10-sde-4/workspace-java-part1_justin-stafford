package com.entertainment;

import java.util.Arrays;

/*
* Business class to model the workings of a television.
 */
public class Television {
    //  as advertised constants
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS = {"Samsung", "Sony", "LG", "Toshiba"};
// attributes or properties - aka "fields" or "instance variables" in Java

    private static int instanceCount = 0;

    public static int getInstanceCount() {
        return instanceCount;
    }

    private String brand = "Toshiba";  // default value when no brand selected
    private int volume = 1;  //  1 is the default value when no volume selected
    private DisplayType display = DisplayType.LED;
    public boolean isMuted;  // provide getter only
    private int oldVolume; //completely hidden, no getters or setters

    // constructors
    public Television() {
        instanceCount++;  // instanceCount = instanceCount + 1
    }

    public Television(String brand)
    throws IllegalArgumentException, InvalidBrandException {
        this();  // delegate to no-arg ctor for the increment
        setBrand(brand);
    }

    public Television(String brand, int volume)
    throws IllegalArgumentException, InvalidBrandException {
        this(brand);
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType displayType)
    throws IllegalArgumentException, InvalidBrandException {
        this(brand, volume);
        setDisplay(displayType);
    }

// functions or operations - aka "methods" in Java - what do com.entertainment.Television objects DO?

    // Method to turn off my television

    public void mute() {
        if (!isMuted()) {  // currently not muted, emitting sound (32)
            oldVolume = getVolume();
            setVolume(0);  // sets the volume to 0
            isMuted = true;
        } else {
            setVolume(oldVolume);  // back to 32;
            isMuted = false;
        }
    }

    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turn on the " + getBrand() + " TV to the volume of " + volume);
    }

    // Method to turn off my television
    public void turnOff() {
        System.out.println("Shutting down...goodbye");
    }

    // Method for checking internet connection
    private boolean verifyInternetConnection() {
        return true;
    }

// Getters and Setters

    public boolean isMuted() {
        return isMuted;
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public String getBrand() {
        return brand;
    }


    //Use VALID_BRANDS here instead of hardcoded magic strings "Samsung", "Sony"
    //VALID-BRANDS looks like ["Samsung", "Sony"...
    public void setBrand(String brand) throws InvalidBrandException {
        boolean valid = false;

        if (isValidBrand(brand)) {
            this.brand = brand;
        }
        else {
           throw new InvalidBrandException(
                   String.format("Invalid brand: %s. Must be one of %s.\n",
                   brand, Arrays.toString(VALID_BRANDS)));
            }
        }
        // VALID_BRANDS looks like this ["Samsung", "Sony", "LG", "Toshiba"]
        private static boolean isValidBrand(String brand) {
            boolean valid = false;

            for (String currentBrand : VALID_BRANDS) {
                if (brand.equals(currentBrand)) {
                    valid = true;
                    break;
                }
            }
            return false;
            // return valid;
        }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (MIN_VOLUME <= volume && volume <= MAX_VOLUME) {
            this.volume = volume;  // volume only gets set if it fall w/i min and max
            isMuted = false; // automatially unmuted
        } else {
            throw new IllegalArgumentException(
                    String.format("Invalid Volume: %s. Must be between %s and %s.\n",
                    volume, MIN_VOLUME, MAX_VOLUME));
        }
//            System.out.println("Invalid number " + volume + " doesn't fall between " + MIN_VOLUME +
//                    " and " + MAX_VOLUME);
    }

        // toString is displayed last
        public String toString(){
            String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());
            return String.format("com.entertainment.Television: brand=%s, volume=%s, display=%s",
                    getBrand(), volumeString, getDisplay());
        }
    }

