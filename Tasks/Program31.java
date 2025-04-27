package Tasks;

import java.util.Scanner;
public class Program31 {
    public static void main(String[] args) 
    {
      @SuppressWarnings("resource")
      Scanner Sc = new Scanner(System.in);
      System.out.print("Enter the Character: ");
      Character Ch = Sc.next().charAt(0);

      if(Character.isUpperCase(Ch))
      {
        System.out.println(Ch + " "+"is a Upper-case Character");
        System.out.println(Character.toLowerCase(Ch)+" is Changed case into a Lower-case Character");
      }
      else if(Character.isLowerCase(Ch))
      {
        System.out.println(Ch +" "+"is a Lower-case Character");
        System.out.println(Character.toUpperCase(Ch)+" is Changed case into a Upper-case Character");
      }
      else 
      {
        System.out.println("It is not a Character");
      }
    }
}
