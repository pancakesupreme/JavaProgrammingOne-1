package Chapter3;

import java.util.Scanner;

/**
 * Program checks the weight and price of two packages and determines which one
 * has the better price
 *
 * @author Emory Meursing
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int p1Weight, p2Weight;
        double p1Price, p2Price;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a weight and price for package 1: ");
        p1Weight = input.nextInt();
        p1Price = input.nextDouble();
        System.out.println("Please enter a weight and price for package 2: ");
        p2Weight = input.nextInt();
        p2Price = input.nextDouble();
        if ((p2Price / p2Weight) < (p1Price / p1Weight)) {
            System.out.println("Package 2 has a better price.");
        } else if ((p2Price / p2Weight) > (p1Price / p1Weight)) {
            System.out.println("Package 1 has a better price.");
        } else {
            System.out.println("The packages have the same price.");
        }
    }

}
