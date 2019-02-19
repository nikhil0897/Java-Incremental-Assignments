package solution3;

/*
 * @author Nikhil Sharma
 */

public class ConstructorManipulation {

    ConstructorManipulation(String name) { // no call to this parameterised constructor

        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        String name = "Nikhil";
        ConstructorManipulation[] objectArray = new ConstructorManipulation[10]; // won't print anything as the array as no call
                                                                         // has been made yet
    }
}
