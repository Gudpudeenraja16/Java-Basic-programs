package Tasks;

import java.util.Scanner;
public class Program25 {
    public static void main(String[] args) {
     @SuppressWarnings("resource")
     Scanner Sc = new Scanner(System.in);
     System.out.print("Enter the Principal amount: ");
     Double P = Sc.nextDouble();
     System.out.print("Enetr the Simple interest: ");
     Double SI = Sc.nextDouble();
     System.out.print("Enter the Rate of interest: ");
     Double R = Sc.nextDouble();
     System.out.print("Enter the No of Times interest: ");
     double N = Sc.nextDouble();
     Double CI = (P*(SI+R)*N)/100;
     System.out.println("Compound Interest: "+CI);
    }

    
}
