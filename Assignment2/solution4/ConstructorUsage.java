package solution4;

/*
 * @author Nikhil Sharma
 */

public class ConstructorUsage {

        ConstructorUsage(String S ) {

            System.out.println("String: " + S);
        }

        public static void main( String[] args ) {

            String S1 = "Nikhil";
            ConstructorUsage[] arr = new ConstructorUsage[10];
            for( int i = 0; i<10; i++ ) {
                arr[i] = new ConstructorUsage(S1);     //will print "Nikhil" 10 times as it make calls to the non-default constructor with string as an argument
            }
        }

}
