package Chapter3;

import java.util.Scanner;

/**
 * Program checks to see if a nondecimal number is divisible by 5 and/or 6
 *
 * @author Emory Meursing
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a nondecimal variable: ");
        int userInput = input.nextInt();

        boolean andFive = (userInput % 5 == 0);
        boolean andSix = (userInput % 6 == 0);

        System.out.print("Is " + userInput + " devisible by 5 and 6? ");
        if (andFive && andSix == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.print("Is " + userInput + " devisible by 5 or 6? ");
        if (andFive || andSix == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.print("Is " + userInput + " devisible by 5 or 6, but not both? ");
        if (andFive ^ andSix == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
