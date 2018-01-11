package Chapter2;

import java.util.Scanner;

/**
 * Program is designed to calculate the tip after a meal
 *
 * @author Emory Meursing
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Subtotal input
        System.out.print("Please enter your subtotal: ");
        double subtotal = input.nextDouble();
        //Gratuity Rate
        System.out.print("Please enter your gratuity rate: ");
        double gratuity = input.nextDouble();
        double total = subtotal + (subtotal * (gratuity * .01));
        System.out.println("Your gratuity is " + gratuity + "% and your total is " + total);
    }

}
