package Tasks;

import java.util.Scanner;
public class Program44 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Radius of the Cone: ");
        Double r =Sc.nextDouble();
        System.out.println("Enter the Height of the Cone: ");
        Double h =Sc.nextDouble();
        Double V = (1/3.0)*Math.PI*r*r*h;
        System.out.println("The Volume of the Cone is: "+V);
    }
    
}
