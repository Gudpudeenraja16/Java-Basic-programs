package Tasks;

import java.util.Scanner;
public class Program15 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the X Value:");
        int X = Sc.nextInt();
        System.out.print("Enter the Y Value:");
        int Y = Sc.nextInt();
        System.out.print("Enetr the Z Value:");
        int Z = Sc.nextInt();
        
        //Swapping Numbers with Temp variable
        int temp=X;
        X=Y;
        Y=Z;
        Z=temp;

        System.out.println("After the Rotation");
        System.out.println("X=" + X);
        System.out.println("Y="+ Y);
        System.out.println("Z="+ Z);
    }
}
