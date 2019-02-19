package solution2;

/**
 * @author Nikhil Sharma
 */

public class CyclePart {

    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        Cycle[] collectionCycle = { unicycle, bicycle, tricycle };

        for (Cycle cycleObject : collectionCycle) {
            // cycleObject.balance(); ///cannot execute because there is no such method in Cycle class
        }

        ((Unicycle) collectionCycle[0]).balance();
        ((Bicycle) collectionCycle[1]).balance();
        // (( Tricycle )arr[2] ).balance(); ///cannot execute because there is no such method in Tricycle class
    }
}
