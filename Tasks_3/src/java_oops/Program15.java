import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        Program15 main = new Program15();
        Program15.Inner inner = main.new Inner();
        main.reverseNumber(inner);
        System.out.println("The Reverse Number is: "+inner.num);
    }

    public void reverseNumber(Inner inner) {
        reverseNumberRecursive(inner.num);
        inner.num = reverse;
    }

    private int reverse = 0;

    private void reverseNumberRecursive(int num) {
        if (num == 0) {
            return;
        }
        reverse = reverse * 10 + num % 10;
        reverseNumberRecursive(num / 10);
    }

    class Inner {
        int num;
        
        Inner() {
            Scanner Sc = new Scanner(System.in);
            System.out.println("Enter the Number: ");
            num = Sc.nextInt();
            System.out.println("The Number is: "+num);
        }
    }
}
