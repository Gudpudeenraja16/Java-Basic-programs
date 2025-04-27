package Tasks;

import java.util.Scanner;
import java.lang.Math;
public class Program12 {
    public static void main(String agrs[])
    {
     @SuppressWarnings("resource")
     Scanner Sc = new Scanner(System.in);
     System.out.print("Enter the T value:");
     int t = Sc.nextInt();
     
     double X = 8*Math.pow(t,2)-Math.pow(t,3)+4;
     System.out.println("The First Evaluate:"+ X);
     
     double Y = Math.sin(t) + Math.cos(2*t);
     System.out.println("The Second Evaluate:"+Y);
     
     double Z = Math.exp(3*t+5);
     System.out.println("Third Evaluate:"+Z);
    }
}
