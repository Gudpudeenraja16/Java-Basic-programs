package Tasks;

import java.util.Scanner;
import java.lang.Math;

public class Program8 {
    public static void main(String agrs[])
    {
    @SuppressWarnings("resource")
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the Number:");
    double num = Sc.nextDouble();
    System.out.println("SquarRoot Value:"+ Math.pow(num,2));
    System.out.println("CubeRoot Value:"+ Math.pow(num,3));
    }
}
