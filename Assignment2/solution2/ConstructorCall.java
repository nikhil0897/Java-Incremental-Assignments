package solution2;

/*
 * @author Nikhil Sharma
 */

public class ConstructorCall {  //first call

    ConstructorCall( ) {
        this( 55, "Nikhil" );   //call to the parameterised constructor
        System.out.println("This is the default constructor.");
    }

    ConstructorCall( int a, String S ) {
        System.out.println(S + " scored " + a + " runs in last match.");
    }

    public static void main( String[] args ) {

        ConstructorCall obj = new ConstructorCall();    //default constructor is called as soon as an object of the class is created
    }
}
