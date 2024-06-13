public class Intermediate_6_b {
    public static void main(String[] args) 
    { 
     System.out.println("Before swap:");
     System.out.println();

     int a = 5;
     System.out.println("a = " + a);

     System.out.println();

     int b = 10;
     System.out.println("b = " + b);
     System.out.println();
    
     a = a + b;
     b = a - b;
     a = a - b;

     System.out.println("After swap without using third variable:");
     System.out.println();

     System.out.println("a = " + a);
     System.out.println();

     System.out.println("b = " + b);
       
    }
}

