package Java_part2;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int Num = Sc.nextInt();

        if (Num>0)
        {
            System.out.println(Num +" is Positive");
        }
        else if (Num<0)
        {
            System.out.println(Num +" is Negative");
        }
        else
        {
            System.out.println(Num +" is Zero");
        }
    }
}
