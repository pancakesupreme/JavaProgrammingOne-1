package Chapter6;

import java.util.Scanner;

/**
 * Program checks if password is valid
 *
 * @author Emory Meursing
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;

        System.out.println("Please enter a password: ");
        password = input.next();

        // checks to see if conditions are false
        while (!lengthChecker(password) || !isValid(password) || !digitCounter(password)) {

            System.out.println("Invalid password.");

            if (!lengthChecker(password)) {
                System.out.println("Your password must have at least 8 characters.");
            }

            if (!isValid(password)) {
                System.out.println("Your password must both contain characters and digits");
            }

            if (!digitCounter(password)) {
                System.out.println("Your password does not have enough digits.");
            }

            System.out.println("Please enter another password: ");
            password = input.next();
        }

        if (digitCounter(password) && isValid(password) && lengthChecker(password)) {
            System.out.println("Your password is valid.");
        }
    }

    /**
     * Method checks if password is too long
     *
     * @param password password being passed
     * @return true or false
     */
    public static boolean lengthChecker(String password) {
        boolean tooLong;
        tooLong = password.length() >= 8;
        return tooLong;

    }

    /**
     * Method checks to see if the password has specified letters and digits
     *
     * @param password passes the password
     * @return true or false
     */
    public static boolean isValid(String password) {
        String n = ".*[0-9].*";
        String a = ".*[A-Z].*";
        return password.matches(n);
    }

    /**
     * Method checks to see if password has enough digits
     *
     * @param password passes the password
     * @return true or false
     */
    public static boolean digitCounter(String password) {
        return password.matches("(?=(.*?\\d){2})[a-zA-Z0-9]{2,}");
    }

}
