package Java_part2;

import java.util.Scanner;

public class Program22 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Numbers: ");
        int num = Sc.nextInt();
        int r =0;

        while (num > 0)
        {
            r =r*10+num%10;
            num/= 10;
        }
        System.out.println("Reversed Number is: "+r);
    }
}
