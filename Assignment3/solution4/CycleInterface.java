package solution4;

/*
 * @author Nikhil Sharma
 */

interface Cycle {

}

class Bicycle implements Cycle {
    Bicycle() {
        System.out.println("Bicycle ready to ride.");
    }
}

class Tricycle implements Cycle {
    Tricycle() {
        System.out.println("Tricycle ready to ride.");
    }
}

class Unicycle implements Cycle {
    Unicycle() {
        System.out.println("Unicycle ready to ride.");
    }
}

class BicycleFactory {
    public static Cycle getBicycle() {
        return new Bicycle();
    }
}

class TricycleFactory {
    public static Cycle getTricycle() {
        return new Tricycle();
    }
}

class UnicycleFactory {
    public static Cycle getUnicycle() {
        return new Unicycle();
    }
}

public class CycleInterface {

    public static void main(String[] args) {
        Cycle firstCycle = BicycleFactory.getBicycle();
        Cycle secondCycle = UnicycleFactory.getUnicycle();
        Cycle thirdCycle = TricycleFactory.getTricycle();
    }
}
