package Tasks;

import java.util.Scanner;
public class Program24 {
   public static void main(String[] args) 
   {
   @SuppressWarnings("resource")
   Scanner Sc = new Scanner(System.in); 
   System.out.print("Enter the Principal amount: ");
   Double P = Sc.nextDouble();
   System.out.print("Enter the Rate of interest in Percentages without symbol: ");
   Double N = Sc.nextDouble();
   System.out.print("Enter the Time period in Years: ");
   Double R = Sc.nextDouble();
   Double SI = (P*N*R)/100;
   System.out.println("Simple Intrest: "+ SI);
  
   }
}
