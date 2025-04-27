package Tasks;

import java.util.Scanner;
public class Program28 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the Number or Character: ");
        Character ch = Sc.next().charAt(0);
        if (Character.isLetter(ch))
        {
        System.out.println(ch +" "+"is an Alphabetic Character.");
        }
        else if (Character.isDigit(ch))
        {
            System.out.println(ch +" "+"is an Numberic Digit.");
        }
        else
        {
            System.out.println(ch +" "+"is a Other.");
        }
    }
}
