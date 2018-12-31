package regex;

import java.util.regex.Pattern;
import java.util.Scanner;

public class RegularExpression {

    public String checkPattern( String S ) {
        if(Pattern.matches("^[A-Z].*[.]$", S)) {    //checks whether the string passed matches the required pattern given in the problem or not
            return "Yes, the string matches required sequence.";
        }
        else {
            return "No, the string doesn't match the required sequence.";
        }
    }

    public static void main( String[] args ) {
        RegularExpression R = new RegularExpression();
        String S;
        System.out.println("Enter the string that you want to check: ");
        Scanner input = new Scanner(System.in);
        S = input.nextLine();
        System.out.println(R.checkPattern(S));
    }
}