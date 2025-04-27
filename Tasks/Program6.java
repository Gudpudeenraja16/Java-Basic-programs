package Tasks;

import java.util.Scanner;

public class Program6 {
   public static void main(String agrs[])
    {
    @SuppressWarnings("resource")
    Scanner S = new Scanner(System.in);
    System.out.println("Enter the Celsius Temperature:");
    int C = S.nextInt();
    double F = 32+C*5/9;
    System.out.println("Fahrenheit Temperature is :" +F); 
}
}
