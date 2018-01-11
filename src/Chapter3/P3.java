package Chapter3;

import java.util.Scanner;

/**
 * Program designed to see if a variable is greater than another number, can be
 * divided by zero, if it's a proper fraction, what it's grade is on a letter
 * scale from 1 to 100, and if its in the range of 1 to 100
 *
 * @author Emory Meursing
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double firstNum, secondNum;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a variable: ");
        firstNum = input.nextDouble();

        System.out.print("Please enter a second variable: ");
        secondNum = input.nextDouble();
        //if first number less, greater, or equal
        if (firstNum < secondNum) {
            System.out.println("The first number is less than the second number.");
        }
        if (firstNum > secondNum) {
            System.out.println("The first number is greather than the second.");
        }
        if (firstNum == secondNum) {
            System.out.println("The first number is equal to the second number.");
        }
        //if first number less
        if (firstNum <= secondNum) {
            System.out.println("The first number is less than or equal to the second number");
        }
        //if first number not equal
        if (firstNum != secondNum) {
            System.out.println("The first number is not equal to the second.");
        }
        //division by zero
        if (secondNum == 0) {
            System.out.println("Cannot divide by zero.");
        } //fraction
        else if ((firstNum / secondNum) < 1) {
            System.out.println("Proper fraction.");
        } else {
            System.out.println("Improper fraction.");
        }
        //grade worth
        if (firstNum >= 90) {
            System.out.println("A");
        } else if (firstNum >= 80) {
            System.out.println("B");
        } else if (firstNum >= 70) {
            System.out.println("C");
        } else if (firstNum >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        //in range
        if (secondNum >= 1 && secondNum <= 100) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
    }
}
