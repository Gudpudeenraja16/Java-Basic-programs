package Tasks;

import java.util.Scanner;
public class Program32 {
    public static void main(String[] args) {
      @SuppressWarnings("resource")
      Scanner Sc = new Scanner(System.in);
      System.out.println("Enter the Number:");
      Integer num = Sc.nextInt();
      System.out.println("The Square of "+num+" = "+num*num);  
      System.out.println("The Square root of "+num+" = "+Math.sqrt(num));
    }
}
