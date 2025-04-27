package Tasks;

import java.util.Scanner;
public class Program48 {
   public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the Number N: ");
    Integer n = Sc.nextInt();
    int S = (n*(n+1)*(2*n+1))/6;
    int C = (n*(n+1)/2)*2;
    System.out.println("The Sum of Squares of first n Natural numbers: "+S);
    System.out.println("The Sum of Cubes of first n Natural numbers: "+C);
   } 
}
