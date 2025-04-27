
import java.util.Scanner;

public class Program8 {

    // Method to calculate area of a circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate area of a rectangle
    public double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    // Method to calculate area of a triangle
    public double calculateArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return 0.0;
    }

    // Method to calculate area of a Square
    public double calculateArea(int side) {
         return side*side;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Program8 P8 = new Program8();
        double area = 0.0; // Single variable for storing area
        char choice;
        
        do{
        System.out.println("Choose the shape to calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Square");
        int option = Sc.nextInt();

        switch (option) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = Sc.nextDouble();
                area = P8.calculateArea(radius);
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = Sc.nextDouble();
                System.out.print("Enter the breadth of the rectangle: ");
                double breadth = Sc.nextDouble();
                area = P8.calculateArea(length, breadth);
                break;
            case 3:
                System.out.print("Enter the base of the triangle: ");
                double base = Sc.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = Sc.nextDouble();
                area = P8.calculateArea(base, height, true);
                break;
            case 4:
                System.out.println("Enter the site of the Square: ");
                int side = Sc.nextInt();
                area = P8.calculateArea(side);
                break;
            default: 
                System.out.println("Invalid choice.");
                return;
        }
        System.out.println("The area is: " + area);
        System.out.println("Do You Want to Continue? (Y/N):");
        choice = Sc.next().charAt(0);
        }while(choice == 'Y' || choice == 'y');
        Sc.close();
        
        System.out.println("Thank you for Using the Calculated Shapes!");
    }
}


