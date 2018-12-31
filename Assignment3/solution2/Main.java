package solution2;

public class Main {

    public static void main( String[] args ) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        Cycle[] arr = {unicycle, bicycle, tricycle};

        for (Cycle C : arr) {
            //C.balance(); cannot execute because there is no such method in Cycle class
        }

        (( Unicycle )arr[0] ).balance();
        (( Bicycle )arr[1] ).balance();
        //(( Tricycle )arr[2] ).balance(); cannot execute because there is no such method in Tricycle class

    }
}
