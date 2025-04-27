package Java_part2;

public class Program10 {
    public static void main(String[] args) {
        int n = 10;
        int s = Sum(n);
        System.out.println("The First N Natural numbers without using Loop Statement");
        System.out.println("Sum of First "+n+" Natural number is: "+s);
    }
    public static int Sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else {
            return n+Sum(n-1);
        }
    }
}
