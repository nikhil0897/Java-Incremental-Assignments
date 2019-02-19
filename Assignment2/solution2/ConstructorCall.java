package solution2;

/**
 * @author Nikhil Sharma
 */

public class ConstructorCall {

    ConstructorCall() { // will get a call as soon as an object to the class is created
        this(55, "Nikhil"); // call to the parameterised constructor
        System.out.println("This is the default constructor.");
    }

    ConstructorCall(int runs, String name) {
        System.out.println(name + " scored " + runs + " runs in last match.");
    }

    public static void main(String[] args) {

        ConstructorCall printInput = new ConstructorCall(); // default constructor is called as soon as an object of the class is created
    }
}
