package Java_part2;

import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Student Name: ");
        String name = Sc.nextLine();
        System.out.println("Enter the Five Subject Marks ");
        int num1 = Sc.nextInt();
        int num2 = Sc.nextInt();
        int num3 = Sc.nextInt();
        int num4 = Sc.nextInt();
        int num5 = Sc.nextInt();
        int total = num1+num2+num3+num4+num5;
        System.out.println("Your Name is: "+name);
        System.out.println("Your Total Marks is: "+total);
        double average = (double) total /5;
        System.out.println("Your Average Value is: "+average);
        String result = average>=40?"Pass":"Fail";
        System.out.println("Your Result is: "+result);
        if(average>=80)
        {
            System.out.println("Your Grade is: A");
        }
        else if(average>=60)
        {
            System.out.println("Your Grade is: B");
        }
        else if (average>=40)
        {
            System.out.println("Your Grade is: C");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
