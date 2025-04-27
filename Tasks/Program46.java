package Tasks;

import java.util.Scanner;
public class Program46 {
   public static void main(String[] args) {
    @SuppressWarnings("resource")
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the Side A: ");
        Double a = Sc.nextDouble();
        System.out.print("Enter the Side B: ");
        Double b = Sc.nextDouble();
        System.out.print("Enter the Side C: ");
        Double c = Sc.nextDouble();
        Double V = a*b*c;
        Double S = 2*(a*b+b*c+c*a);
        System.out.println("The Volume of the Box: "+V);
        System.out.println("The Surface of the Box: "+S);
   } 
}
