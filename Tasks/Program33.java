package Tasks;

import java.util.Scanner;
import java.lang.Math;
public class Program33 {
    public static void main(String[] args) {
      @SuppressWarnings("resource")
      Scanner Sc = new Scanner(System.in);
      System.out.println("enter the Value of X:");
      Double x = Sc.nextDouble();
      System.out.println("Exponential Value of X: "+Math.exp(x));
      System.out.println("Sec Value of X: "+ 1/Math.sin(x));
      System.out.println("Cosec Value of X: "+ 1/Math.cos(x));
      System.out.println("Cot Value of X: "+ Math.cos(x)/Math.sin(x));
    }
}
