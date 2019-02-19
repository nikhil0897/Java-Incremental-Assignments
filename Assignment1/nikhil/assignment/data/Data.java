package nikhil.assignment.data;

public class Data {

    int first;
    char second;

    public void printValue() {
        System.out.println("Instance variable: " + first);
        System.out.printf("Instance variable: " + second);
    }

    public void printData() {

        int totalValue;
        char firstWord; // Local variables in Java are not given any default value,
                        // whereas instance variables are char firstWord;
        // System.out.println(totalValue);
        // System.out.println(firstWord);
    }

}
