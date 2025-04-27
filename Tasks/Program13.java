package Tasks;

import java.util.Scanner;
public class Program13 {
    public static void main(String agrs[])
    {
        @SuppressWarnings("resource")
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the Price:");
        float Price = Sc.nextFloat();
        int A = (int)(Price*100);
        System.out.println("The "+ Price + "Price of the "+ A + "Paise"); 
    }

}
