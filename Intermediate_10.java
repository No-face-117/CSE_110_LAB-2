import java.util.Scanner;

public class Intermediate_10 {
    public static void main(String[] args) 
    { 
     
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter the starting number (a): ");
     int a = scanner.nextInt();

     System.out.println();

     System.out.print("Enter the number of terms (n): ");
     int n = scanner.nextInt();

     if ( a > 0)
     {
        int L = 100;
        double sum = ((n / 2) * (a + L));
        System.out.println("The sum of the first 100 positive numbers is : " + sum);

     }

     else if ( a <= 0)
     {
        int L = 100 - a;
        double sum = ((n / 2) * (a + L));
        System.out.println("The sum of the first 100 positive numbers is : " + sum);

     }

     System.out.println("No loops used!");

     scanner.close();
       
    }
}

