package Java_part2;

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = Sc.nextInt();

        if(isPerfect(num))
        {
            System.out.println(num + " is a Perfect Number");
        }
        else {
            System.out.println(num + " is Not a Perfect Number");
        }
    }

    public static boolean isPerfect(int num)
    {
        int sum =0;
        for(int i=1; i<=num/2; i++)
        {
            if(num % i== 0)
            {
                sum+=i;
            }
        }
        return sum == num;
    }
}
