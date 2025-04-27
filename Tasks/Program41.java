package Tasks;

import java.util.Scanner;
public class Program41 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the Radius of the Circle: ");
    Double r = Sc.nextDouble();
    Double C = 2*Math.PI*r;
    System.out.println("The Circumference of the Circle is: "+C); 
    }
}
