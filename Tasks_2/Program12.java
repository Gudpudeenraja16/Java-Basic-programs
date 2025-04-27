package Java_part2;

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = Sc.nextInt();
        boolean prime = false;

        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                prime = true;
                break;
            }
        }
        if (prime == true)
        {
            System.out.println(num + " is a Prime Number");
        }
        else {
            System.out.println(num + " is Not a Prime Number");
        }

    }
}