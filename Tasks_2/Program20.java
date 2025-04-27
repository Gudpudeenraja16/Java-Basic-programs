package Java_part2;

import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter N Number: ");
        int n = Sc.nextInt();
        int[] fibo = new int[n];
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i=2; i<n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        System.out.println("Fibonacci Series: " + n + " Numbers");
            for(int num:fibo)
            {
                System.out.println(num);
            }

    }
}
