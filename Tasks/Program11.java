package Tasks;

import java.util.Scanner;
public class Program11 {
    public static void main(String agrs[])
    {
     @SuppressWarnings("resource")
     Scanner Sc = new Scanner(System.in);
     System.out.print("Enter the A Value:");
     int a = Sc.nextInt();
     System.out.print("Enter the B Value:");
     int b = Sc.nextInt();
     System.out.print("Enter the C Value:");
     int c = Sc.nextInt();
     int X= a/(b-c);
     System.out.println("The Expressions of "+ X);
    }
}
