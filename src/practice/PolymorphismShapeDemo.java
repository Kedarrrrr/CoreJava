package practice;

abstract class Shape {

    // abstract method
    abstract double area();

    // concrete method
    void display() {
        System.out.println("Calculating area...");
    }
}

// Child class 1
class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Child class 2
class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}


public class PolymorphismShapeDemo {
	public static void main(String[] args) {

        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(10, 4);

        printArea(s1);
        printArea(s2);
    }

    static void printArea(Shape shape) {
        shape.display();
        System.out.println("Area: " + shape.area());
        System.out.println("------------------");
    }

}
