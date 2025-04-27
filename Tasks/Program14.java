package Tasks;

import java.util.Scanner;
public class Program14 {
    public static void main(String agrs[])
    {
     @SuppressWarnings("resource")
     Scanner Sc= new Scanner(System.in);
     System.out.print("Enter the Paise:");
     int paise = Sc.nextInt();
     int price = paise/100;
     int Remainingpaise = paise%100;
     System.out.println(paise + " " +"is Equal to "+ price +"RS"+ " " +Remainingpaise+"paise");
    }
}
