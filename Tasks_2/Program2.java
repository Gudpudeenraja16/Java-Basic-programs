package Java_part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Program2 {
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name1 = "Virat Kohli";
        System.out.println("\nThe First Name is: "+name1);
        String name2 = "MS Dhoni";
        System.out.println("The Second Name is: "+name2);
        System.out.println("Enter your Name: ");
        String name3 = br.readLine();
        char[] ch = name3.toCharArray();
        Arrays.sort(ch);
        System.out.println("Your Name is Displayed in Alphabetical Order:"+ String.valueOf(ch));
    }
}
