package Tasks;

import java.util.Scanner;
import java.lang.Math;

public class Program45 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the Side A: ");
        Float a = Sc.nextFloat();
        System.out.print("Enter the Side B: ");
        Float b = Sc.nextFloat();
        System.out.print("Enter the angle of Sides Q: ");
        Float q = Sc.nextFloat();
        Double c = a*a+b*b-2*a*b*Math.cos(Math.toRadians(q));
        System.out.println("The Third Side of the Triangle is: "+Math.sqrt(c));
    } 
}
