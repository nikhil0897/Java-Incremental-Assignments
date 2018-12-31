package solution3;

interface InterfaceOne {
    void name();
    void id();
}

interface InterfaceTwo {
    void address();
    void number();
}

interface InterfaceThree {
    void email();
    void aadharNumber();
}

interface InterfaceFour extends InterfaceOne,InterfaceTwo,InterfaceThree{
    void salary();
}

class Mentor {
    Mentor(){
        System.out.println("Mentor assigned.");
    }
}

class Employee extends Mentor implements InterfaceFour {

    public void address() {
        System.out.println("Employee address registered.");
    }

    public void name() {
        System.out.println("Name of the Employee is Nikhil Sharma.");
    }

    public void email() {
        System.out.println("Employee email registered.");
    }

    public void number() {
        System.out.println("Phone number registered.");
    }

    public void aadharNumber() {
        System.out.println("Aadhar number registered.");
    }

    public void id() {
        System.out.println("Employee id given.");
    }

    public void salary() {
        System.out.println("Employee salary registered.");
    }

    void employeeOne(InterfaceOne details1){
        details1.name();
    }
    void employeeTwo(InterfaceTwo details2){
        details2.address();
    }
    void employeeThree(InterfaceThree details3){
        details3.aadharNumber();
    }
    void employeeFour(InterfaceFour details4){
        details4.salary();
    }
}

public class Interfaces {

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.employeeOne(emp);
        emp.employeeTwo(emp);
        emp.employeeThree(emp);
        emp.employeeFour(emp);
    }
}
