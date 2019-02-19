package solution5;

class Employee { // first class containing an inner class
    class Address {
        Address(String address) {
            System.out.println("Employee address: " + address);
        } // non-default constructor
    }
}

public class EmployeeDetails { // second class containing an inner class

    static class Resume extends Employee.Address { // inherits from the first inner class
        Resume(Employee firstObject) {
            firstObject.super("Hyderabad");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Employee employeeData = new Employee();
        Resume document = new Resume(employeeData);
    }
}
