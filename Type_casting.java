import java.util.*;

public class Type_casting {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    // float a = 10.00f;
    // int b = (int) a;          // you can not write  int b = a; it shows error.
   // System.out.println(b);

   int number = (int) sc.nextFloat();
   int b = (int) number;
   System.out.println(b);


    int k = (int) sc.nextFloat();
    System.out.println(k);

    sc.close();                     // scanner object need to close.
    }
}
