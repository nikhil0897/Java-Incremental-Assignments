package solution1;

/*
 * @author Nikhil Sharma
 */

abstract class Rodent {

    public abstract void printSize();
    public abstract void printSpeed();
    public abstract void changeColor();

    Rodent() {
        System.out.println("Default constructor for class Rodent.");
        System.out.println();
    }
}

class Mouse extends Rodent {

    Mouse() {
        System.out.println("This is the default constructor for Mouse class.");
    }
    public void printSize( ) {
        System.out.println("Size of Mouse is 5." );
    }
    public void printSpeed( ) {
        System.out.println("Speed of Mouse is 5." );
    }
    public void changeColor( ) {
        System.out.println("Color of Mouse is black." );
    }
}

class Gerbil extends Rodent {

    Gerbil() {
        System.out.println("This is the default constructor for Gerbil class");
    }

    public void printSize( ) {
        System.out.println("Size of Gerbil is 10." );
    }
    public void printSpeed( ) {
        System.out.println("Speed of Gerbil is 10." );
    }
    public void changeColor( ) {
        System.out.println("Color of Gerbil is white." );
    }
}

class Hamster extends Rodent {

    Hamster() {
        System.out.println("This is the default constructor for Hamster class.");
    }

    public void printSize( ) {
        System.out.println("Size of Hamster is 15." );
    }
    public void printSpeed( ) {
        System.out.println("Speed of Hamster is 15." );
    }
    public void changeColor( ) {
        System.out.println("Color of Hamster is brown." );
    }
}

public class RodentHierarchy {

    public static void main( String[] ags ) {

        Rodent[] rodentGroup = {new Mouse(), new Gerbil(), new Hamster()};
        for( Rodent R : rodentGroup ) {
            System.out.println();
            R.printSize();
            R.printSpeed();
            R.changeColor();
        }
    }
}
