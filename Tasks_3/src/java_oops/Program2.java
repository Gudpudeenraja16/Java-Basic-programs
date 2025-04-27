import java.util.Scanner;

public class Program2 {
    public int add(int a, int b)
    {
        return a+b;
    }
    public int add(int a, int b, int c)
    {
        return a+b+c;
    }
    public double add(double d, double e)
    {
        return d+e;
    }
    public int sub(int a, int b)
    {
        return a-b;
    }
    public double sub(double d, double e)
    {
        return d-e;
    }
    public int mul(int a, int b)
    {
        return a*b;
    }
    public double mul(double d, double e)
    {
        return d*e;
    }
    public double mul(double a, double b, double c)
    {
        return a*b*c;
    }
    public int div(int a, int b)
    {
        if(b==0)
        {
            throw new ArithmeticException("Cannot divided by Zero");
        }
        return a/b;
    }
    public double div(double d, double e)
    {
        if(e==0)
        {
            throw new RuntimeException("Cannot divided by Zero");
        }
        return d/e;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Three Numbers for Integer Arithmetic Operations: ");
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int c = Sc.nextInt();

        System.out.println("Enter the Two Numbers for Double Arithmetic Operations: ");
        double d = Sc.nextDouble();
        double e = Sc.nextDouble();

        Program2 p2 = new Program2();
        System.out.println("There are Integer Arithmetic Operations: ");
        System.out.println("Addition of Two Integer Numbers: "+ p2.add(a,b));
        System.out.println("Addition of Three Integer Numbers: "+ p2.add(a,b,c));
        System.out.println("Subtraction of Two Integer Numbers: "+  p2.sub(a,b));
        System.out.println("Multiplication of Two Integer Numbers: "+ p2.mul(a,b));
        System.out.println("Division of Two Integer Numbers: "+ p2.div(a,b));
        System.out.println("/------------------/--------------------/-------------/");
        System.out.println("There are Double Arithmetic Operations: ");
        System.out.println("Addition of Two Double Numbers: "+ p2.add(d,e));
        System.out.println("Subtraction of Two Double Numbers: "+ p2.sub(d,e));
        System.out.println("Multiplication of Two Double Numbers: "+ p2.mul(d,e));
        System.out.println("Multiplication of Three Double Numbers: "+ p2.mul(a,b,c));
        System.out.println("Division of Two Double Numbers: "+ p2.div(d,e));
    }
}
