package Tasks;

import java.util.Scanner;
public class Program29 {
  public static void main(String[] args) 
  {
    @SuppressWarnings("resource")
    Scanner Sc = new Scanner(System.in);
    System.out.print("Enter a Lower-case Character: ");
    Character CH = Sc.next().charAt(0);
    
    if (Character.isLowerCase(CH))
    {
       System.out.println(CH +" "+"is a Lower-case Character");
    }
    else
    {
        System.out.println(CH +" "+"is a Not Lower-case Character");
    }
  }  
}
