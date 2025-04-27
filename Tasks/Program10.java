package Tasks;

import java.util.Scanner;

public class Program10 {
 public static void main(String agrs[])
 {
  @SuppressWarnings("resource")
  Scanner Sc = new Scanner(System.in);
  System.out.println("Enter the Number to Divide:");
  int num = Sc.nextInt();
  System.out.println("Enter the Divisor number:");
  int div = Sc.nextInt();
  int N = num-div *(num/div);
  System.out.println(N +" is Remainder of "+ "(num/div)" +" Without Remainder Operator");
 }   
}
