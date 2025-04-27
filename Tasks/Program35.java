package Tasks;

import java.util.Scanner;
public class Program35 {
    public static void main(String[] args) {
      @SuppressWarnings("resource")
      Scanner Sc = new Scanner(System.in);
      System.out.println("Enter the Number:"); 
      Integer a =Sc.nextInt();
      int Area = a*a;
      System.out.println("Area of Square "+a +" is " + Area); 
    }
}
