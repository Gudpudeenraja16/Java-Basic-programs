package Tasks;

import java.util.Scanner;
public class Program21 {
    @SuppressWarnings("resource")
    public static void main(String[] args) 
    {
      Scanner Sc = new Scanner(System.in);
      System.out.println("Enter the Three number:");
      Double num1 = Sc.nextDouble();
      Double num2 = Sc.nextDouble();
      Double num3 = Sc.nextDouble();
      Double Greatest = (num1>num2)?(num1>num3?num1:num3):(num2>num3?num2:num3);
      System.out.println("The Greatest Number is: "+ Greatest);
    }
}
