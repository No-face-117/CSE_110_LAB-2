public class Beginner_5 {
    public static void main(String[] args) 
    { 
 
     double inches = 1000.0;
     System.out.println("Conversion factor for inch to meter is 0.0154 inch to meters.");

     System.out.println();

     double conversion_factor = 0.0254;
     double meters = inches * conversion_factor; 
     System.out.println("So " + inches + " inches is " + meters + " meters.");
       
    }
}

