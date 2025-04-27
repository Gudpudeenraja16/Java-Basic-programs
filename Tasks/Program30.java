package Tasks;

import java.util.Scanner;

public class Program30 
{
    public static void main(String[] args) 
  {
    @SuppressWarnings("resource")
    Scanner Sc = new Scanner(System.in);
    System.out.print("Enter a Upper-case Character: ");
    Character CH = Sc.next().charAt(0);

    if(Character.isUpperCase(CH))
    {
        System.out.println(CH +" "+"is a Upper-case Character");
    } 
    else
    {
        System.out.println(CH +" "+"is a not Upper-case Character");
    } 
}
}











