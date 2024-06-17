import java.util.*;

public class ternary_operator {
    public static void main(String args[]){      // variable = condition? statement1 : statement2;
       
        Scanner sc = new Scanner(System.in);
        int number =sc.nextInt();

        String type = ((number%2==0))? "even" : "odd";         // statement1 is true always and statement2 is false
        System.out.println(type);                             // :  yeh denote karta hai "nhi to"
        
        sc.close();
    }
}
