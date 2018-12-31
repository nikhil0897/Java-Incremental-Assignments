package nikhil.assignment.main;

import nikhil.assignment.data.FirstClass;
import nikhil.assignment.singleton.SecondClass;

public class Test {

    public static void main( String[] args ) {

        FirstClass obj = new FirstClass();
        obj.printValue();   //non-static call to the first printValue method
        obj.print();    //non-static call to second print method

        //SecondClass.output();   ///static call to a non-static method of class SecondClass
    }
}
