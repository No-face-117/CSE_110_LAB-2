public class Intermediate_6_a {
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
    
     int something = a;
     a = b;
     b = something;

     System.out.println("After swap using third variable:");
     System.out.println();

     System.out.println("a = " + a);
     System.out.println();

     System.out.println("b = " + b);
       
    }
}

