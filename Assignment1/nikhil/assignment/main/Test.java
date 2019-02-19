package nikhil.assignment.main;

import nikhil.assignment.data.Data;

public class Test {

    public static void main(String[] args) {

        Data file = new Data();
        file.printValue(); // non-static call to printValue()
        file.printData(); // non-static call to printData()

        //Singleton.output(); ///static call to a non-static method is not allowed in Java
    }
}
