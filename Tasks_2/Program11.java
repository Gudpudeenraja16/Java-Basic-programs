package Java_part2;

import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Previous Month Reading: ");
        int P = Sc.nextInt();
        System.out.println("Enter the Current Month Reading: ");
        int C = Sc.nextInt();
        int U = C - P;
        double bill = Bill(U);
        System.out.println("Your EB Bill Amount is " + bill);
    }
    public static double Bill(int U)
    {
        double bill;
        if(U<=100)
        {
            bill = U*10;
        }
        else if(U<=200)
        {
            bill = 10+((U-100)*15);
        }
        else {
            bill = 50+((U-200)*25);
        }
        return bill;
    }
}
