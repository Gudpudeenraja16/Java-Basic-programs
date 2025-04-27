package Tasks;

import java.util.Scanner;

public class Program5 {
    public static void main(String agrs[])
    {
    @SuppressWarnings("resource")
    Scanner S = new Scanner(System.in);
    System.out.println("Enter the Fahrenheit Temperature:");
    double F = S.nextDouble();
    double C = (F-32)*5/9;
    System.out.println("Celsius Temperature is:" +C);
    }
}
