package Java_part2;

import java.util.Scanner;

public class Program21 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number within Limit: ");
        int l = Sc.nextInt();
        System.out.println("Prime Numbers within " + l + " Numbers");
        for (int i = 2; i <= l; i++) {
            if (isprime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isprime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

