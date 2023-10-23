package edu.math;

import static edu.math.Calculator.*;  //Ok to use * for static imports

class CalculatorClient {
    private static double avg;

    public static void main(String[] args) {
        double sum = calculator.add(3,5);
        //* inlay ints "calc.add(3,5)"
        System.out.println("The sum is " + sum);

        System.out.println("The difference is " + Calculator.subtract(3, 5));  //* inline on the fly
        //* method inlining

        System.out.println("10 is even? " + Calculator.isEven(10)); //* inline on the fly

        System.out.println("The average is: " + Calculator.average(3, 4, 5, 9, 15));

        System.out.println();

        int min = 5;
        int max = 20;
        boolean itWorks = true;
        int result = 0;

        // iterate 1_000_000_000 items, calling this method and checking the results against min, max
        for (int i = 0; i < 1_000_000_000; i++) {
            result = Calculator.randomInt(min, max);  // calls the min-max version

            if (result < min || result > max)  {
                itWorks = false;
                break;
            }
        }

            if (itWorks) {
                System.out.println("Congratulations!");
            }

            else {
                System.out.println("You gotta Bug!");
                System.out.println("The value returned is " + result);
            }

        System.out.println();//for readability
        int winner = edu.math.Calculator.randomInt();
        System.out.println("The winner is " + winner);
        // or calc.randomInt()
        System.out.println(); // println for readability
        int overloaded = edu.math.Calculator.randomInt(5,20);
        System.out.println("The overloaded winner is " + overloaded); // calls the min-max version

        System.out.println(avg);
    }
}