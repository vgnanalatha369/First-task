class Person {
    String name;

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int employeeId;

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    String department;

    void displayManager() {
        System.out.println("Department: " + department);
    }
}

class Multilevel {
    public static void main(String[] args) {

        Manager m = new Manager();

        m.name = "Rahul";
        m.employeeId = 101;
        m.department = "IT";

        m.displayPerson();
        m.displayEmployee();
        m.displayManager();
    }
}