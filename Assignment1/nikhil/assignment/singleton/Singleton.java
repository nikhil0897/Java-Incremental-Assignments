package nikhil.assignment.singleton;

public class Singleton {
    String name;
    public static void input( String address ) {
        //name = address;    ///as S1 is a non-static field, it cannot be referred from a static field
    }

    public void output() {

        System.out.println("String: " + name);
    }
}


