package Tasks;

import java.util.Scanner;
public class Program39 {
    public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the Radius of the Cylinder: ");
    Double r = Sc.nextDouble();
    System.out.println("Enter the Height of the Cylinder: ");
    Double h = Sc.nextDouble();
    Double s = (2*Math.PI*r*h)+(2*Math.PI*Math.pow(r, 3));
    System.out.println("The Surface Area of the Cylinder is: "+s);
    }
}
