package nikhil.assignment.singleton;

public class Singleton {
    String name;

    public static void input(String newName) {
        //name = newName; ///as name is a non-static field, it cannot be referred from a static field
    }

    public void output() {

        System.out.println("Input String: " + name);
    }
}
