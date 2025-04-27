package Java_part2;

import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number of Elements in the Array : ");
        int n = Sc.nextInt();
        int[] num = new int[n];
        System.out.println("Enter the Elements of the Array: ");
        for(int i=0; i<n; i++)
        {
            num[i] = Sc.nextInt();
        }
        System.out.println("Enter the Number to Search For: ");
        int SN = Sc.nextInt();

        boolean check = false;
        for(int i=0; i<n; i++) {
            if (num[i] == SN) {
                System.out.println("Number " + SN + " Found at Position " + (i + 1));
                check = true;
                break;
            }
        }
            if(!check) {
                System.out.println("Number "+ SN +" is Not Found in the Array");
            }
        }
    }

