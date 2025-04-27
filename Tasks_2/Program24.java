package Java_part2;

import java.util.Scanner;

public class Program24 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = Sc.nextInt();
        int r =0;
        int o = num;
        while(num>0)
        {
            r = r*10+num%10;
            num /= 10;
        }
        if(o==r)
        {
            System.out.println("The Number is a Palindrome");
        }
        else {
            System.out.println("The Number is a Not Palindrome");
        }
    }
}
