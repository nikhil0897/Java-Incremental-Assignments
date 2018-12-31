package solution1;


abstract class Rodent {

    public abstract void size();
    public abstract void speed();
    public abstract void color();

    Rodent() {

        System.out.println("Default constructor for class Rodent.");
        System.out.println();
    }
}

class Mouse extends Rodent {

    Mouse() {
        System.out.println("This is the default constructor for Mouse class.");
    }
    public void size( ) {
        System.out.println("Size of Mouse is 5." );
    }
    public void speed( ) {
        System.out.println("Speed of Mouse is 5." );
    }
    public void color( ) {
        System.out.println("Color of Mouse is black." );
    }
}

class Gerbil extends Rodent {

    Gerbil() {
        System.out.println("This is the default constructor for Gerbil class");
    }

    public void size( ) {
        System.out.println("Size of Gerbil is 10." );
    }
    public void speed( ) {
        System.out.println("Speed of Gerbil is 10." );
    }
    public void color( ) {
        System.out.println("Color of Gerbil is white." );
    }
}

class Hamster extends Rodent {

    Hamster() {
        System.out.println("This is the default constructor for Hamster class.");
    }

    public void size( ) {
        System.out.println("Size of Hamster is 15." );
    }
    public void speed( ) {
        System.out.println("Speed of Hamster is 15." );
    }
    public void color( ) {
        System.out.println("Color of Hamster is brown." );
    }
}

public class RodentHierarchy {

    public static void main( String[] ags ) {

        Rodent[] array = {new Mouse(), new Gerbil(), new Hamster()};
        for( Rodent R : array ) {
            System.out.println();
            R.size();
            R.speed();
            R.color();
        }
    }
}
