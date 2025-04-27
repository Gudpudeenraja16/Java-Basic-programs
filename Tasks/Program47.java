package Tasks;

import java.util.Scanner;

public class Program47 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number n: ");
        int n = Sc.nextInt();
        Integer Sum = (n*(n+1)/2)*2;
        System.out.println("The Sum of First n Natural number: "+Sum);
    }
}
