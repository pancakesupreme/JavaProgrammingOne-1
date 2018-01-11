package Chapter3;

import java.util.Scanner;

/**
 * Program flips a coin and determines a winner
 *
 * @author Emory Meursing
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 1 or 0 for heads or tails: ");
        int userInput = input.nextInt();
        int coinFlip = (int) (Math.random() * 2);
        if (userInput == coinFlip) {
            System.out.println("Congratulations! You have guessed the coin flip!");
        } else {
            System.out.println("Try again next time!");
        }
    }

}
