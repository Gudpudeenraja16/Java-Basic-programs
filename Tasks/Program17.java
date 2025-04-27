package Tasks;

import java.util.Scanner;
public class Program17 {
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Amount in Rupees:");
        double Rupees = Sc.nextDouble();
        double Dollars = Rupees/74.83;
        System.out.println(Rupees+"INR Rupees is Equal to"+" "+Dollars+"USD Dollars");
    }
}
