package Tasks;

import java.util.Scanner;
public class Program36 {
   public static void main(String[] args) {
   @SuppressWarnings("resource")
   Scanner Sc= new Scanner(System.in);
   System.out.println("Enter the length of Rectangle: ");
   Integer l = Sc.nextInt();
   System.out.println("Enter the breath of Rectangle: ");
   Integer b = Sc.nextInt();
   int a = l*b;
   System.out.println("Area of the Rectangle: "+a);
   } 
}
