package gov.test;

class PrimitivesTest {

    public static void main(String[] args) {
        int age = 56;
        //* these are local variables (used inside the braces of a method)
        System.out.println("age is " + age);

        long population = 800_000_000L;
        System.out.println("population is " + population);

        double price = 9.95;
        System.out.println("price is " + price);

        boolean isSunny = true;
        System.out.println("isSunny is " + isSunny);

        char size = 'S';
        System.out.println("size is " + size);

        String grade = "A";
        System.out.println("grade is " + grade);
        System.out.println();

        System.out.println("roses are red\nviolets are blue");
        System.out.println();

        System.out.println("My favourite color is \"blue");


        }

    }