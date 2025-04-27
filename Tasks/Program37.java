package Tasks;

import java.util.Scanner;
public class Program37 {
    public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the Radius of the Circle:");
    Double r = Sc.nextDouble(); 
    Double a = 3.14*r*r;
    System.out.println("The Area of the Circle is: "+a);   
    }
}
