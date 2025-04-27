package Java_part2;

import java.util.Scanner;

public class Program19 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = Sc.nextInt();
        int sum =0;

        while(num != 0)
        {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits: "+sum);
    }
}
