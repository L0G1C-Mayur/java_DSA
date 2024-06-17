import java.util.*;

public class Input {
   public static void main(String args[]) {         // 'String'  s must be capital
   Scanner sc =  new Scanner(System.in);   
   // 'Scanner'  s must be capital    // sc is object, you can rename as you want
   String input = sc.next();      //  .next()  is used to capture the word, yeh sirf ek word tkk he output show karta hai
   System.out.println(input);
 
   String name  = sc.nextLine();    // .nextLine  (L must capital)  ,  yeh  sentence  output show karta hai
   System.out.println(name);         // dout in string

   int number = sc.nextInt();
   System.out.println(number);

   float price = sc.nextFloat();
   System.out.println(price);

   sc.close();                     // scanner object need to close.
    }
}
