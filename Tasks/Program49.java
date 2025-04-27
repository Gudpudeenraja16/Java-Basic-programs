package Tasks;

import java.util.Scanner;
public class Program49 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner Sc = new Scanner(System.in);
    System.out.print("Enter the Value X1: ");
    int x1 = Sc.nextInt();
    System.out.print("Enter the Value Y1: ");
    int y1 = Sc.nextInt();
    System.out.print("Enter the Value X2: ");
    int x2 = Sc.nextInt();
    System.out.print("Enter the Value Y2: ");
    int y2 = Sc.nextInt();
    Double D = Math.sqrt((x2-x1)*(x2-x1)+Math.pow((y2-y1),2));
    System.out.println("The Distance between the Two points: "+D);
  }  
}
