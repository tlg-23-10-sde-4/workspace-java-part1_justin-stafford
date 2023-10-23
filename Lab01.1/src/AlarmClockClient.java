/*
* Application main-class, i.e., the class definition with the main() method.
*
* Its purpose is to create a few instances of AlarmCLock and give them
* a basic test-drive
 */


class AlarmClockClient {
    public static void main(String[] args) {
        // create a 2nd instance of AlarmClock and set its properties
        AlarmClock clock1 = new AlarmClock();
        clock1.snoozeInterval = 7;

        // create a 2nd instance of AlarmClock and set its properties also
        AlarmClock clock2 = new AlarmClock();
        clock2.snoozeInterval = 10;

        // create a 3rd AlarmClock object, but DON'T set its properties - so what will they be?
        AlarmClock clock3 = new AlarmClock();


        // call methods on them
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();
    }
}