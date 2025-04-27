package Tasks;

import java.util.Scanner;
import java.lang.Character;
public class Program27 {
    
    

    public static void main(String[] args) 
    {
      
      @SuppressWarnings("resource")
      Scanner Sc = new Scanner(System.in);
      System.out.print("Enter a Character: ");
      char ch = Sc.next().charAt(0);
     
      if(Character.isUpperCase(ch))
      {
       System.out.println(ch +" "+"Character is a Uppercase Letter");
      }
      else if(Character.isLowerCase(ch))
      {
       System.out.println(ch +" "+"Character is a Lowercase Letter");
      }
      else
      {
        System.out.println(ch +" "+"is Not a Character");
      }
      
    }
}
