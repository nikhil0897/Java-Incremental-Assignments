package solution4;

public class ConstBase {

        ConstBase( String S ) {

            System.out.println("String: " + S);
        }

        public static void main( String[] args ) {

            String S1 = "Nikhil";
            ConstBase[] arr = new ConstBase[10];
            for( int i = 0; i<10; i++ ) {
                arr[i] = new ConstBase(S1);     //will print "Nikhil" 10 times as it make calls to the non-default constructor with string as an argument
            }
        }

}
