package solution2;

public class ConstructorCall {

    ConstructorCall( ) {    //first call
        this( 55, "Nikihl" );   //call to the parameterised constructor
        System.out.println("This is the default constructor.");
    }

    ConstructorCall( int a, String S ) {

        System.out.println(S + " scored " + a + " runs in last match.");
    }

    public static void main( String[] args ) {

        ConstructorCall obj = new ConstructorCall();    //default constructor is called as soon as an object of the class is created
    }
}
