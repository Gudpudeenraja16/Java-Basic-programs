package Java_part2;

import java.util.Scanner;
public class Program3 {
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        Integer num1 = Sc.nextInt();
        System.out.println("Enter the Second Number: ");
        Integer num2 = Sc.nextInt();
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Quotient");
        System.out.println("5.Remainder");
        System.out.println("6.Invalid");
        System.out.println("Enter Your Choice: ");
        int Choice = Sc.nextInt();

        switch (Choice)
        {
            case 1:
                System.out.println("Result: "+(num1+num2));
                break;
            case 2:
                System.out.println("Result: "+(num1-num2));
                break;
            case 3:
                System.out.println("Result: "+(num1*num2));
                break;
            case 4:
                if(num2!=0)
                {
                    System.out.println("Result: "+(num1/num2));
                }
                else
                {
                    System.out.println("!Error Not Divisible by Zero");
                }
                break;
            case 5:
                if(num2!=0)
                {
                    System.out.println("Result: "+(num1%num2));
                }
                else
                {
                    System.out.println("!Error Not Divisible by Zero");
                }
                break;
            default:
                System.out.println("Your Choice is Invalid Please Try Again");
        }
    }
}
