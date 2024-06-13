//import java.util.Scanner;

public class Expert_13 {
    public static void main(String[] args) 
    { 
     
     //Scanner scanner = new Scanner(System.in);
     
     //Test Data: Input distance in meters: 2500 // Assuming the last 4 digits are 2500

     int distanceMeters = 2500;

     double total_time_H = 5 + (56.0 / 60) + (23.0 / 3600);

     
     double distance_Km = distanceMeters / 1000.0;

      
     double velocity_Km_P_H = distance_Km / total_time_H;

       
     double distance_M = distanceMeters / 1609.0;

      
     double velocity_M_P_H = distance_M / total_time_H;

        
     System.out.println("Your velocity in km/h is : " + velocity_Km_P_H);
     System.out.println();
     System.out.println("Your velocity in miles/h is : " + velocity_M_P_H);

     //scanner.close();
       
    }
}

