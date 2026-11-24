class Student {
    private String name;
    private int rollNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }
}

class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Ashu");
        s.setRollNumber(101);

        System.out.println("Student Name: " + s.getName());
        System.out.println("Roll Number: " + s.getRollNumber());
    }
}
