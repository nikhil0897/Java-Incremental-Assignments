package solution3;

/*
 * @author Nikhil Sharma
 */

public class ConstructorManipulation {

    ConstructorManipulation( String S ) {   //no call to this parameterised constructor

        System.out.println("String: " + S);
    }

    public static void main( String[] args ) {

        String S1 = "Nikhil";
        ConstructorManipulation[] arr = new ConstructorManipulation[10];    //won't print anything as the array as no call has been made yet
    }
}
