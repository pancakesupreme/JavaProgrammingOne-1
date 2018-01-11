package Chapter6;

import java.util.Scanner;
/**
 *
 * @author em0947744
 */
public class C6_18 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String password;
        
        System.out.println("Please enter a password: ");
        password = input.next();
                
        // checks to see if conditions are false
        while(!lengthChecker(password) || !isValid(password) || !digitCounter(password)){
            
        System.out.println("Invalid password.");
        
            if(!lengthChecker(password)){
                System.out.println("Your password must have at least 8 characters.");
            }
        
            if(!isValid(password)){
                System.out.println("Your password must both contain characters and digits");
            }
        
            if(!digitCounter(password)){
                System.out.println("Your password does not have enough digits.");
            }
            
            System.out.println("Please enter another password: ");
            password = input.next();
        }
        
        if(digitCounter(password) && isValid(password) && lengthChecker(password)){
            System.out.println("Your password is valid.");
        }
    }
    
    // checks password length
    // @param password checks if password is too long
    public static boolean lengthChecker(String password){
        boolean tooLong;
        tooLong = password.length() >= 8;
        return tooLong;
        
    }
    
    // @param password @return
    // checks if password has digits
    public static boolean isValid(String password) {
        String n = ".*[0-9].*";
        String a = ".*[A-Z].*";
        return password.matches(n);
    }
    
    //checks to see if password has at least 2 digits
    // @param password check how many digits are in password
    public static boolean digitCounter(String password){
        return password.matches("(?=(.*?\\d){2})[a-zA-Z0-9]{2,}");
    }

}
