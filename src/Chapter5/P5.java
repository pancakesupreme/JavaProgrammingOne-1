package Chapter5;

import java.util.Scanner;

/**
 * Program counts votes
 *
 * @author Emory Meursing
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String human;
        int yes = 0, no = 0;

        System.out.println("Please enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting: ");
        human = input.nextLine();

        while (!"Q".equals(human.toUpperCase())) {
            switch (human.toUpperCase()) {
                case ("Y"):
                    yes++;
                    System.out.println("You have voted yes.");
                    System.out.println("To keep voting, please enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting: ");
                    human = input.nextLine();
                    break;
                case ("N"):
                    no++;
                    System.out.println("You have voted no.");
                    System.out.println("To keep voting, please enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting: ");
                    human = input.nextLine();
                    break;
                default:
                    System.out.println("INVALID CODE: Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting");
                    human = input.nextLine();
                    break;
            }
        }
        if ("Q".equals(human.toUpperCase())) {
            System.out.println("Yes had " + yes + " votes, while no had " + no + " votes.");
            System.out.println("Come again!");
        }
    }
}
