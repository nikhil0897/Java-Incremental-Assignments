package solution4;

/*
 * @author Nikhil Sharma
 */

public class ConstructorUsage {

        ConstructorUsage(String name ) {
            System.out.println("String: " + name);
        }

        public static void main( String[] args ) {
            String name = "Nikhil";
            ConstructorUsage[] objectArray = new ConstructorUsage[10];
            for( int i = 0; i<10; i++ ) {
                objectArray[i] = new ConstructorUsage(name);     //will print "Nikhil" 10 times as it make calls to the non-default constructor with string as an argument
            }
        }
}
