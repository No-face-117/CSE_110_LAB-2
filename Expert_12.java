//import java.util.Scanner;

public class Expert_12 {
    public static void main(String[] args) 
    { 
     
     //Scanner scanner = new Scanner(System.in);

     int studentID = 23221454;

     int last_T_D = studentID % 100;
        
     int units_D = last_T_D % 10;
      
     int tens_D = last_T_D / 10;

     System.out.println("Rightmost digits of the student ID in reverse order:");
     System.out.println();

     System.out.println(units_D);
     System.out.println();

     System.out.println(tens_D);

     //scanner.close();
       
    }
}

