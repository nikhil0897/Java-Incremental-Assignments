package nikhil.assignment.singleton;

public class SecondClass {
    String S1;
    public static void input( String S2 ) {
        //S1 = S2;    ///as S1 is a non-static field, it cannot be referred from a static field
    }

    public void output() {

        System.out.println("String: " + S1);
    }
}


