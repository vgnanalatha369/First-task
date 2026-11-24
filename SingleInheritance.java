class Vehicle {
    String brand;

    void honk() {
        System.out.println("Beep! Beep!");
    }
}

class Car extends Vehicle {
    String modelName;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + modelName);
    }
}

class SingleInheritance {
    public static void main(String[] args) {
        Car c = new Car();

        c.brand = "Toyota";
        c.modelName = "Innova";

        c.honk();
        c.displayDetails();
    }
}