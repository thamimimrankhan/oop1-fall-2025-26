abstract class Shape {

    double val1;
    double val2;

    abstract double calculateArea();

    public void displayShape() {
        System.out.println("This is a shape");
    }
}

class Rectangle extends Shape {

    public Rectangle(double val1, double val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    @Override
    double calculateArea() {
        return val1 * val2;
    }
}

class Circle extends Shape {

    public Circle(double val1) {
        this.val1 = val1;
    }

    @Override
    double calculateArea() {
        return Math.PI * val1 * val1;
    }
}

public class TestShape {

    public static void main(String[] args) {

        Shape s1 = new Rectangle(5, 4);
        Shape s2 = new Circle(3);

        s1.displayShape();
        System.out.println("Rectangle Area: " + s1.calculateArea());

        s2.displayShape();
        System.out.println("Circle Area: " + s2.calculateArea());
    }
}