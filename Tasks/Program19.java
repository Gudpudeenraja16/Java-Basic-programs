package Tasks;

import java.util.Scanner;
public class Program19 {
    public static void main(String[] args) 
    {
     @SuppressWarnings("resource")
     Scanner Sc = new Scanner(System.in);
     System.out.print("Enter the Floating Number:");
     float num = Sc.nextFloat();
     int integer = (int)num;
     System.out.println(integer+" "+"Number is Converted to the Integer");
    }
}
