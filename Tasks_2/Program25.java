package Java_part2;

import java.util.Scanner;

public class Program25 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = Sc.nextInt();
        System.out.println("Factorial Number is: "+factorial(num));
    }
    public static int factorial(int num)
    {
        if(num==0 || num==1)
        {
            return 1;
        }
        else {
            return num*factorial(num-1);
        }
    }
}
