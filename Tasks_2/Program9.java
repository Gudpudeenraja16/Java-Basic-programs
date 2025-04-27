package Java_part2;

public class Program9 {
    public static void main(String[] args) {
        System.out.println("The First 10 Natural Number without using Loop Statement ");
        Number(1);
    }
    public static void Number(int n)
    {
        if(n<=10)
        {
            System.out.println("Number "+n);
            Number(n + 1);
        }
    }
}
