package Tasks;

import java.util.Scanner;

public class Program7 {
    public static void main(String agrs[])
    {
      
    @SuppressWarnings("resource")
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the Two Numbers");
      
    int a = Sc.nextInt();
    int b = Sc.nextInt();
      
    System.out.println("Addition:"+(a+b));
    System.out.println("Subtraction:"+(a-b));
    System.out.println("Multiplication:"+(a*b));
    System.out.println("Division:"+(float)(a/b));
    System.out.println("Reminder:"+(a%b));
    }
}
