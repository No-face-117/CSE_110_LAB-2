//import java.util.Scanner;

public class Expert_14 {
    public static void main(String[] args) 
    { 
     
     //Scanner scanner = new Scanner(System.in);
     
     int a = 8;
     int b = 3;

     int a_1 = a / 2;

     double c = Math.sqrt(Math.pow(a_1 , 2) + Math.pow(b , 2) );
     
     double area = ((3 * Math.sqrt(3)) / 2) * Math.pow(c , 2);

     System.out.println("Area of the hexagon : " + area);

     System.out.println();

     double cer = 6 * c;

     System.out.println("Circumference of the Hexagon : " + cer);

     //scanner.close();
       
    }
}

