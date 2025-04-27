package Java_part2;

import java.util.Arrays;
import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        String[] names = new String[10];
        System.out.println("Enter the 10 Names: ");
        for(int i=0; i<10; i++)
        {
            names[i] = Sc.nextLine();
        }
        Arrays.sort(names);
        System.out.println("Names in Alphabetical Order: ");
        for(String Name : names)
        {
            System.out.println(Name);
        }
    }
}
