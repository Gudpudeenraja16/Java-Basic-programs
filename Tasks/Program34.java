package Tasks;

import java.util.Scanner;
import java.lang.Math;
public class Program34 {
  
  public static void main(String[] args) {
  @SuppressWarnings("resource")
  Scanner Sc= new Scanner(System.in);
  System.out.print("Enter the Value of X: ");
  Double X = Sc.nextDouble();
  Double cosecX =1/Math.cos(X); 
  Double tanX = Math.tan(X);
  Double cotX = Math.cos(X)/Math.sin(X);
  Double Result = cosecX+(1/(tanX+cotX));
  System.out.println("To Evaluated the cosec x+(1/(tan x+cot x)) = "+Result);
 }
}
