import java.util.*;

/**
 * print_odd_even
 */
public class print_odd_even {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   int number = sc.nextInt();

   if (number%2==0){
    System.out.println("even");
   }
   else{
    System.out.println("odd");
   }
   sc.close();
}
}