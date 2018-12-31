package exceptionhandling;
import java.util.Scanner;

class exceptionOne extends Exception {}
class exceptionTwo extends Exception {}
class exceptionThree extends Exception {}

/* I have created 3 custom exceptions here
 * 1. When the number is less than 50
 * 2. When the number is greater than equal to 50 but less than 100
 * 3. When the number is greater than equal to 100 but less than 200
 * 4. For numbers greater than or equal to 200, Nulpointer exception is thrown.
 */

public class ExceptionHandling {

    static void methodThrow( int n ) throws exceptionOne, exceptionTwo, exceptionThree  {

        if( n<50 ) {
            System.out.println("Throwing first exception");
            throw new exceptionOne();
        }

        else if( n>=50 && n<100 ) {
            System.out.println("Throwing second exception");
            throw new exceptionTwo();
        }
        else if( n>=100 && n<200 ) {
            System.out.println("Throwing third exception");
            throw new exceptionThree();
        }
        else {
            System.out.println("Throwing Null pointer exception.");
            throw new NullPointerException();
        }
    }

    public static void main( String[] args ) {

        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = input.nextInt();
        try {
            methodThrow(num);
            if( num == 0 ) {
                throw new NullPointerException();
            }
        }

        catch( exceptionOne | exceptionTwo | exceptionThree | NullPointerException n) {
            System.out.println("Exception caught");
        }

        finally {
            System.out.println("Finally clause is executed.");  //Finally clause is executed every time
        }
    }
}
