package Java_part2;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int Num = Sc.nextInt();

        if(Num%2==0)
        {
            System.out.println(Num + " is a Even Number");
        }
        else
        {
            System.out.println(Num + " is a Odd Number");
        }
    }
}
