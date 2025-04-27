package Tasks;

import java.util.Scanner;
public class Program43 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the Radius of the Sphere");
    Double r =Sc.nextDouble();
    System.out.println("Enter the Height of the Sphere");
    Double h =Sc.nextDouble();
    Double V = (4/3.0)*Math.PI*r*r*h;
    System.out.println("The Volume of the Sphere is: "+V);
  }  
}
