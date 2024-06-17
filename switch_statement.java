import java.util.*;

public class switch_statement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
 
        switch (number){                 // ()  can be number, character   char ch = 'a'  switch (char)

            case 1 : System.out.println("samosa");
            break;                                            // break is imp word in switch statements.
            case 2 : System.out.println("pohe");
            break; 
            case 3 : System.out.println("misal");
            break; 
            case 4 : System.out.println("pohe");
            break; 
            case 5 : System.out.println("apple");
            break; 
            case 6 : System.out.println("mango");  
            break; 
            default: System.out.println("shop is closed");

            sc.close();
        }


    }
}
