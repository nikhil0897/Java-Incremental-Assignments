import java.util.Scanner;

/**
 * @author Nikhil Sharma
 */

class ExceptionFirst extends Exception {

}

class ExceptionSecond extends Exception {

}

class ExceptionThird extends Exception {

}

/**
 * I have created 3 custom exceptions here
 *  1. When the grade is less than 40
 *  2. When the grade is greater than equal to 40 and less than 80
 *  3. When the grade is greater than equal to 80 and less than equal to 100
 */

public class ExceptionHandling {

    static void throwException(int checkGrade) throws ExceptionFirst, ExceptionSecond, ExceptionThird {

        if (checkGrade < 40) {
            System.out.println("Failed the examination.");
            throw new ExceptionFirst();
        }
        else if (checkGrade >= 40 && checkGrade < 80) {
            System.out.println("Passed the examination with B grade.");
            throw new ExceptionSecond();
        }
        else if (checkGrade >= 80 && checkGrade <= 100) {
            System.out.println("Got an outstanding A grade.");
            throw new ExceptionThird();
        }
        else {
            System.out.println("Invalid score.");
        }
    }

    public static void main(String[] args) {

        int inputNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        inputNumber = input.nextInt();
        try {
            if (inputNumber == 0) {
                System.out.println("NullPointerException thrown.");
                throw new NullPointerException();
            }
            else
                throwException(inputNumber);
        }

        catch (ExceptionFirst | ExceptionSecond | ExceptionThird | NullPointerException caughtException) {
            System.out.println("Exception caught.");
        }

        finally {
            System.out.println("Finally clause is executed."); // Finally clause is executed every time
        }
    }
}

/**
 * Test cases:
 * 1. 99
 * Output: Got an outstanding A grade.
 *         Exception caught.
 *         Finally clause is executed.
 *
 * 2. 39
 * Output: Failed the examination
 *         Exception caught.
 *         Finally clause is executed.
 *
 * 3. 155
 * Output: Invalid score.
 *         Finally clause is executed.
 *
 * 4. 50
 * Output: Passed the examination with B grade.
 *         Exception caught.
 *         Finally clause is executed.
 *
 * From taking a look at various outputs, we can easily verify that Finally clause is executed every time no matter what the exception is.
 */
