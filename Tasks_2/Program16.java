package Java_part2;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter N Number of Elements: ");
        int n = Sc.nextInt();
        Integer[] num = new Integer[n];
        System.out.println("Enter the Numbers: ");
        for(int i=0; i<n; i++)
        {
            num[i] =Sc.nextInt();
        }
        Arrays.sort(num);
        System.out.println("Ascending Order: "+ Arrays.toString(num));

        Arrays.sort(num, Collections.reverseOrder());
        System.out.println("Descending Order: "+ Arrays.toString(num));

    }
}
