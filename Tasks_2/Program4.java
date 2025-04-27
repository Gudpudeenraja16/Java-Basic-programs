package Java_part2;

import java.util.Scanner;
public class Program4
{
    public static boolean isPalindrome(String str)
    {
        int left = 0;
        int right = str.length() -1;

        while(left < right)
        {
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right)))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter the Name: ");
        String s = Sc.nextLine();

        if(isPalindrome(s))
        {
            System.out.println(s + " is a Palindrome.");
        }
        else
        {
            System.out.println(s + " is a not Palindrome.");
        }
    }
}
