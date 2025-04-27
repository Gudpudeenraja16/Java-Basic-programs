package Tasks;

import java.util.Scanner;

public class Program3 {
    
    public static void main(String agrs[])
    {
        System.out.println("\t\t ABC School");
        System.out.println("\t Student Mark list");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Name:\t");
        String Name = sc.nextLine();
        
        System.out.print("STD:\t");
        String STD = sc.nextLine();
        
        System.out.print("Tamil:\t");
        int Tamil = sc.nextInt();
        
        System.out.print("English:");
        int English = sc.nextInt();
        
        System.out.print("Maths:\t");
        int Maths = sc.nextInt();
        
        int Total = Tamil+English+Maths;
        System.out.println("Total:\t"+Total);

        System.out.println("\t\t ABC School");
        System.out.println("\t Student Mark list");
        
        System.out.println("\t Name    :\t"+Name);
        System.out.println("\t STD     :\t"+STD);
        System.out.println("\t Tamil   :\t"+Tamil);
        System.out.println("\t English :\t"+English);
        System.out.println("\t Maths   :\t"+Maths);
        System.out.println("\t Total   :\t"+Total);
    }
}
