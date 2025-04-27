package Java_part2;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Employee ID: ");
        int id = Sc.nextInt();
        System.out.println("Enter the Basic Salary: ");
        double BS = Sc.nextDouble();
        double DA,TA,HRA;
         if (BS>=15000 && BS<=25000)
         {
             DA = 5;
             TA = 10;
             HRA = 20;
         }
         else if (BS>25000 && BS<=35000)
         {
             DA = 8;
             TA = 12;
             HRA = 25;
         }
         else
         {
             DA = 10;
             TA = 15;
             HRA = 28;
         }
         double D = (DA/100)*BS;
         double T = (TA/100)*BS;
         double H = (HRA/100)*BS;

         double Netsalary = BS+D+T+H;

        System.out.println("Employee ID : "+id);
        System.out.println("Basic Salary : "+BS);
        System.out.println("Dearness Allowance (DA) : "+D);
        System.out.println("Travel Allowance (TA) : "+T);
        System.out.println("House Rent Allowance(HRA) : "+H);
        System.out.println("Net salary : "+Netsalary);
    }

}
