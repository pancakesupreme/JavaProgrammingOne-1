package Chapter6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program converts a dollar amount to euro, pound sterling, or yen
 *
 * @author Emory Meursing
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double euro, pound, yen, dollars, conversion;
        String answer, more = "SOMETHING";
        ArrayList conversionAmounts = new ArrayList();

        System.out.println("Please enter the Euro conversion rate:");
        euro = input.nextDouble();
        System.out.println("Please enter the Pound Sterling conversion rate:");
        pound = input.nextDouble();
        System.out.println("Please enter the Yen conversion rate:");
        yen = input.nextDouble();

        while (more.toUpperCase() != "NO") {
            System.out.println("Enter how many dollars you would like converted: ");
            dollars = input.nextDouble();

            System.out.println("Would you like to convert to Euros ('E'), Pound Sterlings ('P'), or Yen ('Y')? ");
            answer = input.next();
            switch (answer.toUpperCase()) {
                case "E":
                    conversion = Conversion(euro, dollars);
                    conversionAmounts.add(conversion);
                    System.out.printf("This your amount of dollars converted to Euros: %.2f", conversion);
                    break;
                case "P":
                    conversion = Conversion(pound, dollars);
                    conversionAmounts.add(conversion);
                    System.out.printf("This your amount of dollars converted to Pounds Sterling: %.2f", conversion);
                    break;
                case "Y":
                    conversion = Conversion(yen, dollars);
                    conversionAmounts.add(conversion);
                    System.out.printf("This your amount of dollars converted to Yen: %.2f", conversion);
                    break;
                default:
                    System.out.println("Invalid currency; valid currencies are Euros ('E'), Pound Sterlings ('P'), or Yen ('Y')");
                    answer = input.nextLine();
                    break;
            }

            do {
                System.out.println("\nWould you like to input another conversion (yes or no)? ");
                more = input.next();
            } while (!more.toUpperCase().equals("NO") && !more.toUpperCase().equals("YES"));

            if (more.toUpperCase().equals("NO")) {
                System.out.println("These are all your conversions: " + conversionAmounts);
                return;
            }
        }
    }

    /**
     * Converts the dollar amount to the specified currency
     *
     * @param currency passes what currency is used
     * @param dollars passes amount of dollars
     * @return returns the converted value
     */
    public static double Conversion(double currency, double dollars) {
        double result, reducement;
        if (dollars > 100) {
            reducement = dollars * .05;
            dollars = dollars - reducement;
        } else {
            reducement = dollars * .1;
            dollars = dollars - reducement;
        }
        result = dollars * currency;
        return result;
    }
}
