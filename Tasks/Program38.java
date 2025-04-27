package Tasks;

import java.util.Scanner;
public class Program38 {
   public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner Sc = new Scanner(System.in);
    System.out.print("Enter the value A: ");
    Double a = Sc.nextDouble();
    System.out.print("Enter the value B: ");
    Double b = Sc.nextDouble();
    System.out.print("Enter the value C: ");
    Double c = Sc.nextDouble();

    Double s = (a+b+c)/2;

    Double Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.println("The Area of the Triangle is: "+Area);

   } 
}
