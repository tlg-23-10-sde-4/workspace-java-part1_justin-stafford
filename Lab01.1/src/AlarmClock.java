/*
 *Class definitions to model the working of tan alarm clock.
 * This is called a "business class" or "system class" as it contains
 * business things (attributes and methods).
 * This class definitions does NOT have a main() method - most don't.
 */
class AlarmClock {
    // Properties or attributes - in Java, we call these "instance variables" or "fields"
    int snoozeInterval = 5;  //default value for when client doesn't specify (instead of 0)

    // functions or operations - in Java, we call these "methods"
    void snooze() {
        System.out.println("Snoozing " + snoozeInterval + " minutes");

    }
}