class Employee {
    String name;
    double baseSalary;

    void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    void writeCode() {
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Developer is writing code");
    }
}

class Tester extends Employee {
    String testingTool;

    void runTests() {
        System.out.println("Testing Tool: " + testingTool);
        System.out.println("Tester is running tests");
    }
}

class heirarchicalinheritance {
    public static void main(String[] args) {

        Developer d = new Developer();

        d.name = "Rahul";
        d.baseSalary = 40000;
        d.programmingLanguage = "Java";

        System.out.println("Developer Details:");
        d.displayBasicInfo();
        d.writeCode();

        System.out.println();

        Tester t = new Tester();

        t.name = "Priya";
        t.baseSalary = 35000;
        t.testingTool = "Selenium";

        System.out.println("Tester Details:");
        t.displayBasicInfo();
        t.runTests();
    }
}