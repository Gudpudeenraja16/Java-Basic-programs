package Tasks;

import java.util.Scanner;
public class Program50 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the Value X1: ");
        Double x1 = Sc.nextDouble();
        System.out.print("Enter the Value Y1: ");
        Double y1 = Sc.nextDouble();
        System.out.print("Enter the Value X2: ");
        Double x2 = Sc.nextDouble();
        System.out.print("Enter the Value Y2: ");
        Double y2 = Sc.nextDouble();
        Double midX = (x1+x2)/2;
        Double midY = (y1+y2)/2;
        System.out.println("The Mid-point of X-axis line: "+midX);
        System.out.println("The Mid-point of Y-axis line: "+midY);
      }  
}
