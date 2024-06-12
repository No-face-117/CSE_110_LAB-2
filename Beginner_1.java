public class Beginner_1 {

    public static void main(String[] args) 
    {
    System.out.println("Beginner_Level_Question-1 = Determining legal identifiers");
    System.out.println
    (
     "TO name variables   "
     +
     "1.Variable name must start with a letter, dollar sign ($), or underscore (_). "
     +
     "2.Spaces are not allowed. "
     +
     "3.Must avoid using reserved keywords as variable names. "
     +
     "4.If the name you choose consists of only one word, must spell that word in all lowercase letters."
     +
     "5.If it consists of more than one word, must capitalize the first letter of each subsequent word. "
     +
     "6.Else connect multiple words with underscore."
    );
    System.out.println();

    // a) hungry
    System.out.println("hungry is a valid variables");
    System.out.println();
    // b) 2AB
    System.out.println("2AB is not a valid variable (Starts with number)");
    System.out.println();
    // c) 312.2
    System.out.println("312.2 is not a valid variable (Starts with number and is a number)");
    System.out.println();
    // d) MOBILE
    System.out.println("MOBILE is a valid variables");
    System.out.println();
    // e) “Ans"
    System.out.println(" Question number_e is not a valid variable (Identifiers cannot contain double quotes (\") as they are used for string literals)");
    System.out.println();
    // f) $30
    System.out.println("$30 is a valid variables");
    System.out.println();
    // g) Yes/No
    System.out.println("Yes/no is not a valid variable (Has forward slash)");
    System.out.println();
    // h) student-id
    System.out.println("student-id is not a valid variable (Has hyphens)");
    System.out.println();
    // i) A+3
    System.out.println("A+3 is not a valid variable (Has +)");
    System.out.println();
    // j) ‘X’
    System.out.println("'X' is not a valid variable (Has single quotes)");
    System.out.println();
    // k) return
    System.out.println("return is not a valid variable ('return' is a reserved keyword)");
    System.out.println();  
    }
}

