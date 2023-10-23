package edu.math;


class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;

    }
    //* boolean method: form of a question
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }
    /*
    * Returns a random integer between 1 and 19 (inclusive).
    *
    * HINT: see a class called Math (package java.lang), look for a helpful here.
    * NOTE: the methods in the Math class are all "static," which means you call them as:
    * Math.methodName()
    * randomInt()
    */
    public static int randomInt() {
        double rand = Math.random();   // 0.00000 to 0.99999
        double scaled = (Math.random() * 19) + 1;  // 0.00000 to 19.99999
        return (int) scaled;
    }



     public static int randomInt(int min, int max) {
        int maxminrange = (max - min) + 1;
        return (int) maxminrange;
     }
     /*
     * Returns the average (arithmetic mean of the supplied integers.
     * getAverage(), or perhaps just average()
     *
     */
//    public static double average(int... values) {
//        double result = 0.0;
//
//        double sum = 0.0;
//        for (int value : values) {
//            sum = sum + value;
//        }
//        result = sum/values.length;
//        return result;
//        }
    public static double average(int... values) {
        double sum = 0.0;

        for (int value : values) {
            sum += value;
        }

        return sum / values.length;
       }
       double avg = average(3,4,5,9,15);
  }
