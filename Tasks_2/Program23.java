package Java_part2;

import java.util.Scanner;

public class Program23 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String S = Sc.nextLine();
        boolean Palindrome = true;
        int start =0;
        int end = S.length()-1;
        while(start<end)
        {
            if(S.charAt(start) != S.charAt(end))
            {
                Palindrome =false;
                break;
            }
            start++;
            end--;
        }
        if(Palindrome)
        {
            System.out.println("The String is a Palindrome");
        }
        else {
            System.out.println("The String is not a Palindrome");
        }
    }
}
