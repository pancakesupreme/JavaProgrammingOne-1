package Chapter5;

import java.util.Scanner;
/**
 * Program reverses a string
 * 
 * @author Emory Meursing
 */
public class C5_46 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args){
        String answer, answerReverse; 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a sentence to reverse: ");
        answer = input.next();
        
        answerReverse = new StringBuffer(answer).reverse().toString();
        
        System.out.println("Your reversed string is: " + answerReverse);
    }
}
