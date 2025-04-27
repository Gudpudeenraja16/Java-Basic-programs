import java.util.Scanner;

public class Program4 {
    
    static double conversion_rate = 80.00;
    public static String Convert(double rupees)
    {
        double dollars = rupees/conversion_rate;
        return String.format("%2f RS. = %.2f$", rupees, dollars);
    }
    public static String Convert(int dollars)
    {
        double rupees = dollars*conversion_rate;
        return String.format("%d$ = %.2f RS.", dollars, rupees);
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        char choice;
        
        do{
        System.out.println("Currency Converter:");
        System.out.println("1. Convert Rupees to Dollar");
        System.out.println("2. Convert Dollar to Rupees");
        System.out.println("Choose an Option (1 or 2)");
        int option = Sc.nextInt();
        
        switch (option) {
            case 1:
                System.out.println("Enter the Amount in Rupees: ");
                double rupees = Sc.nextDouble();
                System.out.println(Convert(rupees));
                break;
            case 2:
                System.out.println("Enter the Amount in Dollars: ");
                int dollars = Sc.nextInt();
                System.out.println(Convert(dollars));
                break;
            default:
                System.out.println("!Invalid option");
                break;
        }
        System.out.println("Do You want to Continue? (Y/N)");
        choice = Sc.next().charAt(0);
    }while(choice == 'Y' || choice == 'y');
    Sc.close();
    System.out.println("Thank you for Using the Currency Converter!");
    }
}
