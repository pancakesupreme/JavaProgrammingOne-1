package Chapter2;

import java.util.Scanner;

/**
 * Program is designed to find the price of your dinner with your tip
 *
 * @author Emory Meursing
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double meal, drink, dessert, salesTax, tip, dinner, total;
        double displayTax = 10, displayTip = 15;
        System.out.println("Please enter the price of your meal: ");
        meal = input.nextDouble();
        System.out.println("Now, please enter your drink price: ");
        drink = input.nextDouble();
        System.out.println("Finally, please enter your dessert price: ");
        dessert = input.nextDouble();
        dinner = meal + drink + dessert;
        salesTax = dinner * .1;
        tip = salesTax * .15;
        total = dinner + salesTax + tip;
        System.out.println("Your dinner price is $" + dinner + " with the sales tax"
                + " being " + displayTax + "% and your tip is " + displayTip + "% , making"
                + " your total today: $" + total);
    }
}
