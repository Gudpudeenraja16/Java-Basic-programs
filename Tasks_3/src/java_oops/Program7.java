
abstract class Shape {
    
    abstract double area();

    abstract void print();
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }

    @Override
    public void print() {
        System.out.println("Square with side: " + side + ", Area: " + area());
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    public void print() {
        System.out.println("Rectangle with length: " + length + " and width: " + width + ", Area: " + area());
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void print() {
        System.out.println("Circle with radius: " + radius + ", Area: " + area());
    }
}

public class Program7 {
    public static void main(String[] args) {

        Shape square = new Square(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape circle = new Circle(3);

        square.print();
        rectangle.print();
        circle.print();
    }
}
