import java.util.Scanner;

public class Beginner_4 {
    public static void main(String[] args) 
    { 
 
     Scanner scanner = new Scanner(System.in);
    
     System.out.print("Enter an integer: ");
     int number = scanner.nextInt();

     System.out.println();

     int lastTwoDigits = number % 100;

     if (lastTwoDigits < 0) 
     {
     lastTwoDigits += 100;
     }

     System.out.println("The last two digits are: " + lastTwoDigits);

     scanner.close();

    }
}

