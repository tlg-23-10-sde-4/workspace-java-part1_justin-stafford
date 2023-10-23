package entertainment.tic;/*
 * Application main-class, i.e., the class definition with the main() method.
 *
 * Its purpose is to create a few instances of AlarmCLock and give them
 * a basic test-drive
 */


class AlarmClockClient {
    public static void main(String[] args) {
        // create a 2nd instance of com.tic.AlarmClock and set its properties
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(7);

        // create a 2nd instance of com.tic.AlarmClock and set its properties also
        AlarmClock clock2 = new AlarmClock(AlarmClock.MAX_INTERVAL); // as long as it can
        // this uses constructor instead of using setter

        // create a 3rd com.tic.AlarmClock object, but DON'T set its properties - so what will they be?
        AlarmClock clock3 = new AlarmClock();


        // call methods on them
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();

        System.out.println();
        // show their toString() methods in action
        System.out.println(clock1.toString());  //this executes first
        System.out.println(clock2);  // reference to an com.tic.AlarmClock object
        System.out.println(clock3); // toString() automatically called
    }


}