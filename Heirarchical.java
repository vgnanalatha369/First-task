class Shape {
    String color;

    void displayColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    double radius;

    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    double calculateArea() {
        return length * width;
    }
}

class Heirarchical {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.color = "Red";
        c.radius = 5;

        System.out.println("Circle Details:");
        c.displayColor();
        System.out.println("Area: " + c.calculateArea());

        Rectangle r = new Rectangle();
        r.color = "Blue";
        r.length = 10;
        r.width = 5;

        System.out.println("\nRectangle Details:");
        r.displayColor();
        System.out.println("Area: " + r.calculateArea());
    }
}