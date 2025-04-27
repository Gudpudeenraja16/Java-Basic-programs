package Tasks;

import java.util.Scanner;
import java.lang.Math;
public class Program26 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        Float num =Sc.nextFloat();
        Double Logvalue = Math.log(num);
        Double Sinvalue = Math.sin(num);
        Double Cosvalue = Math.cos(num);
        Double Tanvalue = Math.tan(num);
        System.out.println("Logarithmic Value: "+Logvalue);
        System.out.println("Sine Value: "+Sinvalue);
        System.out.println("Cosine Value: "+Cosvalue);
        System.out.println("Tangent Value: "+Tanvalue);
    }
}
