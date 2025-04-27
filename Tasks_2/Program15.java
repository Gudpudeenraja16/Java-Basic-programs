package Java_part2;

import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = Sc.nextInt();
        StringBuilder alphabet = new StringBuilder();
        while (num > 0) {
            int digit = num % 10;
            alphabet.insert(0, getAlphabet(digit));
            num /= 10;
        }
        System.out.println(alphabet);
    }

    public static String getAlphabet(int digit) {
        if (digit == 0) {
            return "Zero";
        } else if (digit == 1) {
            return "ONE";
        } else if (digit == 2) {
            return "TWO";
        } else if (digit == 3) {
            return "THREE";
        } else if (digit == 4) {
            return "FOUR";
        } else if (digit == 5) {
            return "FIVE";
        } else if (digit == 6) {
            return "Six";
        } else if (digit == 7) {
            return "Seven";}
        else if (digit == 8) {
            return "Eight";}
        else if (digit == 9) {
            return "Nine";}
        else {
            return "TEN";
        }
    }
}
