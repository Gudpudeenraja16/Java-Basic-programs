package Tasks;

import java.util.Scanner;
public class Program23 {
   public static void main(String[] args) {
   try (Scanner Sc = new Scanner(System.in)) {
      System.out.print("Enter the Number:");
      Integer num = Sc.nextInt();
      String Result = (num==0)?"Zero":(num>0)?"Positive":"Negative";
      System.out.println(num +" "+"is a"+" "+Result);
   }
   } 
}
