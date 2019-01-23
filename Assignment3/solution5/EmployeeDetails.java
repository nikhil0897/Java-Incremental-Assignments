package solution5;

class Employee {    //first class containing an inner class
    class Address {
        Address( String str ) {
            System.out.println("Employee address: " + str);
        }   //non-default constructor
    }
}

public class EmployeeDetails {  //second class containing an inner class

    static class Resume extends Employee.Address {  //inherits from the first inner class
        Resume( Employee obj1 ) {
            obj1.super("Hyderabad");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        Resume document = new Resume( emp );
    }
}
