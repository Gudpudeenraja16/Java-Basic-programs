package Tasks;

import java.util.Scanner;
public class Program20 {
    public static void main(String[] args) 
    {
       @SuppressWarnings("resource")
       Scanner Sc = new Scanner(System.in);
       System.out.println("Enter the Two Integer Number");
       //Integer is a wrapper class of java.lang package
       Integer num1 = Sc.nextInt();
       Integer num2 = Sc.nextInt(); 
       Integer Greatest =(num1>num2)?num1:num2;
       System.out.println("The Greatest Number is: "+Greatest);
    }
}
