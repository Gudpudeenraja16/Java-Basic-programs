package Tasks;

import java.util.Scanner;
public class Program22 {
    public static void main(String[] args) 
    {
       @SuppressWarnings("resource")
       Scanner Sc = new Scanner(System.in);
       System.out.println("Enter the Number to check Odd or Even");
       Integer num = Sc.nextInt();
       String Result = (num%2==0)?"Even":"Odd";
       System.out.println("The Number is "+Result);
    }
}
