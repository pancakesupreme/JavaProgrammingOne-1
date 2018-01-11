package Chapter4;

import java.util.Scanner;

/**
 * Program is designed to check if one string is a substring of the second
 *
 * @author Emory Meursing
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1, s2;
        System.out.println("Please enter string s1: ");
        s1 = input.next();
        System.out.println("Please enter string s2: ");
        s2 = input.next();
        if (s1.toLowerCase().contains(s2.toLowerCase())) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is not a substring of " + s1);
        }
    }
}
