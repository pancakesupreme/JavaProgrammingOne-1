package Chapter4;

import java.util.Scanner;

/**
 * Program checks to see what major and what year you are in based on input
 *
 * @author Emory Meursing
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String total, major, grade;
        System.out.println("Please enter two characters: ");
        total = input.next();
        major = total.substring(0, 1);
        grade = total.substring(1, 2);

        //determines if switch is valid
        switch (major.toUpperCase()) {
            case ("M"):
                major = "Mathmatics ";
                break;
            case ("C"):
                major = "Computer Science ";
                break;
            case ("I"):
                major = "Information Technology ";
                break;
            default:
                major = "Invalid Input";
                break;
        }

        //if major doesnt equal invalid, changes grade
        if (major != "Invalid Input") {
            switch (grade) {
                case ("1"):
                    grade = "Freshman";
                    break;
                case ("2"):
                    grade = "Sophomore";
                    break;
                case ("3"):
                    grade = "Junior";
                    break;
                case ("4"):
                    grade = "Senior";
                    break;
                default:
                    grade = "Invalid grade";
                    break;
            }
        }

        //output
        if (major != "Invalid Input") {
            System.out.println(major + grade);
        } else {
            System.out.println(major);
        }
    }

}
