package entertainment.tic;

/*
 *Class definitions to model the working of tan alarm clock.
 * This is called a "business class" or "system class" as it contains
 * business things (attributes and methods).
 * This class definitions does NOT have a main() method - most don't.
 */
class AlarmClock {
    // these are shared static variables; only 1 copy of these, reside in the class-wide common area.
    public static int MIN_INTERVAL = 1;
    public static int MAX_INTERVAL = 20;

    // Properties or attributes - in Java, we call these "instance variables" or "fields"
    // business constraint; must be between 1 and 20 (inclusive)
    private int snoozeInterval = 5;  //default value for when client doesn't specify (instead of 0)



    // constructors - these get call
    public AlarmClock() {
    // no-op
    }

    public AlarmClock(int snoozeInterval) {  // delegates to setters for any validation/conversion
        setSnoozeInterval(snoozeInterval);
    }

    // functions or operations - in Java, we call these "methods"
    public void snooze() {
        System.out.println("Snoozing " + getSnoozeInterval() + " minutes");

    }

    // accessor methods - provide "controlled" access to the object's fields
    // this allows us to do things like data validation
    public  int getSnoozeInterval() {
        return snoozeInterval;
    }

    // TODO: enforce the data constraint (if-else) -> must be between 1 and 20 (inclusive)
    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) {
            this.snoozeInterval = snoozeInterval;
        }
        else {
            System.out.println("Invalid snooze interval: " + snoozeInterval + ". " +
                    "Must be between" + MIN_INTERVAL + " and" + MAX_INTERVAL + ".");

        }
    }

    public String toString() {
        return "com.tic.AlarmClock: snoozeIntervals = " + getSnoozeInterval();
 // returns back to client.  Let client decide what to do; don't print it.

    }
}

