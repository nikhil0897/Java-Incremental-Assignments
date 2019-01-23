package nikhil.assignment.main;

import nikhil.assignment.data.Data;

public class Test {

    public static void main( String[] args ) {

        Data file = new Data();
        file.printValue();   //non-static call to the first printValue method
        file.print();    //non-static call to second print method

        //Singleton.output();   ///static call to a non-static method of class Singleton
    }
}
