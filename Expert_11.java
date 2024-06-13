//import java.util.Scanner;

public class Expert_11 {
    public static void main(String[] args) 
    { 
     
     //Scanner scanner = new Scanner(System.in);

     double a = 4.5;
     double b = 9.5;
    
     double c = Math.sqrt(Math.pow(a , 2) + Math.pow(b , 2));
        
     double sinA = a / c;
     double cosA = b / c;
     double sinB = b / c;
     double cosB = a / c;

        
     System.out.println("For the right-angled triangle with sides a = " + a + ", b = " + b + ":");
     System.out.println();

     System.out.println("Hypotenuse (c) = " + c);
     System.out.println();

     System.out.println("SinA = " + sinA);
     System.out.println();

     System.out.println("CosA = " + cosA);
     System.out.println();

     System.out.println("SinB = " + sinB);
     System.out.println();

     System.out.println("CosB = " + cosB);

     //scanner.close();
       
    }
}

