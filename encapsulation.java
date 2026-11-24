class Rectangle {
    private double length;
    private double width;

    public void setLength(double length) {
        if (length > 0)
            this.length = length;
        else
            System.out.println("Invalid length");
    }

    public void setWidth(double width) {
        if (width > 0)
            this.width = width;
        else
            System.out.println("Invalid width");
    }

   
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    
    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class encapsulation {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.setLength(10);
        r.setWidth(5);

        System.out.println("Length: " + r.getLength());
        System.out.println("Width: " + r.getWidth());
        System.out.println("Area: " + r.calculateArea());
        System.out.println("Perimeter: " + r.calculatePerimeter());
    }
}