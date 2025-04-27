package Java_part2;

import java.util.Scanner;
public class Program14 {
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num =Sc.nextInt();
        StringBuilder alphabet = new StringBuilder();
        while (num>0)
        {
            int digit = num%10;
            alphabet.insert(0, getAlphabet(digit));
            num/=10;
        }
        System.out.println(alphabet);
    }
    public static String getAlphabet(int digit)
    {
        return switch (digit) {
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            case 10 -> "TEN";
            default -> null;
        };
    }
}
