public class Intermediate_7 {
    public static void main(String[] args) 
    { 

     int minutes = 3456789;

     int minutes_p_d = 60 * 24;
     int days_p_y = 365;

     int total_days = minutes / minutes_p_d;
     int rem_minutes = minutes % minutes_p_d;

     int years = total_days / days_p_y;
     int days = total_days % days_p_y;

     System.out.println("So " + minutes + " minutes is approximately " + years + " years and " + days + " days.");
     System.out.println();
     System.out.println("And " + rem_minutes + " minutes are remaining.");
       
    }
}

