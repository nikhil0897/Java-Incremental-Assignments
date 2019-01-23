package exceptionhandling;
import java.util.Scanner;

/*
 * @author Nikhil Sharma
 */

class ExceptionFirst extends Exception {}
class ExceptionSecond extends Exception {}
class ExceptionThird extends Exception {}

/* I have created 3 custom exceptions here
 * 1. When the number is less than 50
 * 2. When the number is greater than equal to 50 but less than 100
 * 3. When the number is greater than equal to 100 but less than 200
 */

public class ExceptionHandling {

    static void throwException( int numberCheck ) throws ExceptionFirst, ExceptionSecond, ExceptionThird  {

        if( numberCheck<50 ) {
            System.out.println("Throwing first exception.");
            throw new ExceptionFirst();
        }

        else if( numberCheck>=50 && numberCheck<100 ) {
            System.out.println("Throwing second exception.");
            throw new ExceptionSecond();
        }
        else if( numberCheck>=100 && numberCheck<200 ) {
            System.out.println("Throwing third exception.");
            throw new ExceptionThird();
        }
        else {
            System.out.println("Throwing Null pointer exception.");
            throw new NullPointerException();
        }
    }

    public static void main( String[] args ) {

        int inputNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        inputNumber = input.nextInt();
        try {
            throwException(inputNumber);
            if( inputNumber == 0 ) {
                throw new NullPointerException();
            }
        }

        catch( ExceptionFirst | ExceptionSecond | ExceptionThird | NullPointerException n) {
            System.out.println("Exception caught.");
        }

        finally {
            System.out.println("Finally clause is executed.");   //Finally clause is executed every time
        }
    }
}

/*
 * Testcases:
 * 1. 999
 *     Output: Throwing Null pointer exception.
 *             Exception caught.
 *             Finally clause is executed.
 * 2. 9999999999:
 *     Previous Output: Exception in thread "main" java.util.InputMismatchException: For input string: "9999999999"
 *     If I change the output to long it will solve this error but I don't point of doing this as it will only
 *     occupy more memory.
 */
