package Tasks;

import java.util.Scanner;
public class Program18 {
    public static void main(String[] args) {
      @SuppressWarnings("resource")
      Scanner Sc = new Scanner(System.in);
      System.out.println("Enter the Amount in Dollars:");
      double Dollars = Sc.nextDouble();
      double Rupees = Dollars*74.83;
      System.out.println(Dollars+"USD Dollars is Equal to the "+Rupees+"INR Rupees");
    }
    
}
