package regex;

import java.util.regex.Pattern;
import java.util.Scanner;

/*
 * @author Nikhil Sharma
 */

public class RegularExpression {
    /*
        @param checkInput, this method takes the String input and checks whether the specified conditions applies to it or not
     */
    public String checkPattern( String checkInput ) {
        if(Pattern.matches("^[A-Z].*[.]$", checkInput)) {    //checks whether the string passed matches the required pattern or not
            return "Yes, the string matches required sequence.";
        }
        else {
            return "No, the string doesn't match the required sequence.";
        }
    }

    public static void main( String[] args ) {
        RegularExpression R = new RegularExpression();
        String userInput;
        System.out.println("Enter the string that you want to check: ");
        Scanner input = new Scanner(System.in);
        userInput = input.nextLine();
        System.out.println(R.checkPattern(userInput));
    }
}

/* Testcases:
 * 1. I am Nikhil
 *      Output: No, the string doesn't match the required sequence. ///first letter is capital but there is no full stop (.) at the end
 * 2. i am Nikhil.
 *      Output: No, the string doesn't match the required sequence. ///as there is full stop (.) at the end this time but the first letter isn't capital
 * 3. I am Nikhil.
 *      Output: Yes, the string matches required sequence. ///fulfill both the requirement, start with a capital alphabet and ends with a full stop
 */