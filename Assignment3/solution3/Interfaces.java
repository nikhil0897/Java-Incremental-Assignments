package solution3;

/**
 * @author Nikhil Sharma
 */

interface InterfaceOne {
    void printName();

    void printID();
}

interface InterfaceTwo {
    void printAddress();

    void phoneNumber();
}

interface InterfaceThree {
    void checkEmail();

    void printAadharNumber();
}

interface InterfaceFour extends InterfaceOne, InterfaceTwo, InterfaceThree {
    void checkSalary();
}

class Mentor {
    Mentor() {
        System.out.println("Mentor assigned.");
    }
}

class Employee extends Mentor implements InterfaceFour {

    public void printAddress() {
        System.out.println("Employee address registered.");
    }

    public void printName() {
        System.out.println("Name of the Employee is Nikhil Sharma.");
    }

    public void checkEmail() {
        System.out.println("Employee email registered.");
    }

    public void phoneNumber() {
        System.out.println("Phone number registered.");
    }

    public void printAadharNumber() {
        System.out.println("Aadhar number registered.");
    }

    public void printID() {
        System.out.println("Employee id given.");
    }

    public void checkSalary() {
        System.out.println("Employee salary registered.");
    }

    void employeeOne(InterfaceOne details1) {
        details1.printName();
    }

    void employeeTwo(InterfaceTwo details2) {
        details2.printAddress();
    }

    void employeeThree(InterfaceThree details3) {
        details3.printAadharNumber();
    }

    void employeeFour(InterfaceFour details4) {
        details4.checkSalary();
    }
}

public class Interfaces {

    public static void main(String[] args) {
        Employee employeeObject = new Employee();
        employeeObject.employeeOne(employeeObject);
        employeeObject.employeeTwo(employeeObject);
        employeeObject.employeeThree(employeeObject);
        employeeObject.employeeFour(employeeObject);
    }
}
