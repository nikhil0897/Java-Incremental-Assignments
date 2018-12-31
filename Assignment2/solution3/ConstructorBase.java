package solution3;

public class ConstructorBase {

    ConstructorBase( String S ) {   //no call to this parameterised constructor
        System.out.println("String: " + S);
    }

    public static void main( String[] args ) {

        String S1 = "Nikhil";
        ConstructorBase[] arr = new ConstructorBase[10];    //won't print anything
    }
}
