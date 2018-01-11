package Chapter2;

import java.util.Scanner;

/**
 * Program is designed to convert Celsius to Fahrenheit
 *
 * @author emory Meursing
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a celsius temperature: ");
        double celsius = input.nextDouble();
        double fahrenheit = (9 / 5) * celsius + 32;
        System.out.println("This is your fahrenheit tempature: " + fahrenheit);
    }

}
