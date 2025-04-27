package Tasks;

import java.util.Scanner;
public class Program42 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Radius of the Cylinder: ");
        Double r = Sc.nextDouble();
        System.out.println("Enter the Height of the Cylinder: ");
        Double h = Sc.nextDouble();
        Double V = Math.PI*r*r*h;
        System.out.println("The Volume of the Cylinder is: "+V);
    }
    
}
