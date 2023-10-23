package entertainment.tic;

/*
* client side main class focused on validation testing
* Boundary Value Testing
*/
class AlarmClockValidationTest {
    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();

        clock.setSnoozeInterval(1); // should "stick"
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(20); // should "stick"
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(0); // should "stick"
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(21); // should "stick"
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());
    }
}