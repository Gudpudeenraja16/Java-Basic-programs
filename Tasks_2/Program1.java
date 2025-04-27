package Java_part2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Program1 {
    public static void main(String[] args) throws NumberFormatException, IOException 
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      System.out.print("\nEnter the First Number: ");
      Integer num1 = Integer.parseInt(br.readLine());
      System.out.print("Enter the Second Number: ");
      Integer num2 = Integer.parseInt(br.readLine());
      System.out.print("Enter the Third Number: ");
      Integer num3 = Integer.parseInt(br.readLine());
    
      
    if(num1 > num2 && num1 > num3)
     {
         System.out.println("The Greatest Number is: "+num1);
     }
    else if(num2 > num1 && num2 > num3)
     {
         System.out.println("The Greatest Number is: "+num2);
     }
    else
    {
        System.out.println("The Greatest Number is: "+num3);
    }
  }
}
