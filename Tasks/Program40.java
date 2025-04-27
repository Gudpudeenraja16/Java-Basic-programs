package Tasks;

import java.util.Scanner;
public class Program40 {
public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the Radius of Sphere:");
    int r = Sc.nextInt();
    Double S = (4*Math.PI*r*r);
    System.out.println("The Area of the Sphere is: "+S);
}   
}
