package Chapter2;

import java.util.Scanner;

/**
 * Program is designed to find the area and volume of a cylinder
 *
 * @author Emory Meursing
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the radius of your cylinder: ");
        double radius = input.nextDouble();
        System.out.print("Please enter the length of your cylinder: ");
        double length = input.nextDouble();
        double area = radius * radius * 3.14;
        double volume = area * length;
        System.out.println("This is your area: " + area + " and this is your volume "
                + volume);
    }

}
