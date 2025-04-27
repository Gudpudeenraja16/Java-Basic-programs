
import java.util.Scanner;

public class Program9 {
    // Static variable to hold the counter value
    static int counter=0;

    // Method to increase the counter
    public static void increaseCounter() {
        counter++;
        System.out.println("Counter increased. Current value: " + counter);
    }

    // Method to decrease the counter
    public static void decreaseCounter() {
       counter--;
       System.out.println("Counter decreased. Current value: " + counter);
     }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String userInput;

        do {
            System.out.println("Enter 'i' to increase, 'd' to decrease, or 'q' to quit:");
            userInput = Sc.nextLine().toLowerCase();

            switch (userInput) {
                case "i":
                    increaseCounter();
                    break;
                case "d":
                    decreaseCounter();
                    break;
                case "q":
                    System.out.println("Exiting the program. Final counter value: " + counter);
                    break;
                default:
                    System.out.println("Invalid input. Please enter 'i', 'd', or 'q'.");
                    break;
            }
        } while (!userInput.equals("q"));

        Sc.close();
    }
}


