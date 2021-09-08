package firstjavahomeworkgoodluck;

public class firstjavahomewerk {
    public static void main(String[] args) {
        System.out.println("meow");

        // This is a comment

        /* this is a multi line example */

        String name = "Fiona";
        System.out.println(name);

        int x = 7;
        int y = 19;
        System.out.println(x + y); // Print the value of x + y

        byte myAge = 20;
        System.out.println(myAge); //bytes can store whole numbers from -128 to 127

        short myZipcode = 19713;
        System.out.println(myZipcode); //The short data type can store whole numbers from -32768 to 32767

        float satansNum = 6.66f;
        System.out.println(satansNum); //float data type can store fractional numbers from 3.4e−038 to 3.4e+038.
        // Note - should end the value with an "f":

        //Note - easier to use doubles for most calculations.precision of float is only 6 or 7 decimal digits
        // while double variables have a precision of about 15 digits.

        //booleans!!! they are true or false statements

        boolean isLiaStupid = true;
        boolean isLiaHappy = false;
        System.out.println(isLiaStupid);     // Outputs true
        System.out.println(isLiaHappy);   // Outputs false

        //NOTE! these were primitive data types. non-primitive types are Strings, Arrays, Classes, Interface, etc.

        //Widening Casting (automatically) - converting a smaller type to a larger type size
        //byte -> short -> char -> int -> long -> float -> double
        //
        //Narrowing Casting (manually) - converting a larger type to a smaller size type
        //double -> float -> long -> int -> char -> short -> byte

        //widening example
        {
            int myWallet = 1;
            double myDouble = myWallet; // Automatic casting: int to double

            System.out.println(myWallet);      // Outputs 1
            System.out.println(myDouble);
        }  // Outputs 1.0

        //narrowing example
        double myDouble = 5.55d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // outputs 5.55
        System.out.println(myInt);      // output = 5

        //operations
        {
            int m = 1000;
            int k = 80;
            System.out.println(m / k);
        }

        //strings
        {
            String greeting = "Meep";
            System.out.println(greeting);
        }

        //string concatenations

        String celebFirstName = "Kendrick";
        String celebLastName = "Lamar";
        System.out.println(celebFirstName + " " + celebLastName);

        //NOTE:If you add a number and a string, the result will be a string concatenation:

        //string length finder

        String txt = "hopefullyicanimprovemyjavaskills";
        System.out.println("The length of the txt string is: " + txt.length());

        //Math.max(x,y)
        //The Math.max(x,y) method can be used to find the highest value of x and y:

        //example
        System.out.println(Math.max(4359, 999978));

        //same can be applied when you want to find the lowest value by inputting Math.min

        // System.out.println(Math.sqrt(x)); for square root

        //random number
        System.out.println(Math.random());
        //EL FIN










    }
}
