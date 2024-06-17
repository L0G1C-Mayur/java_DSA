import java.util.*;
public class Question_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        int $ = sc.nextInt();    // $ considered as  side.
        long area = $*$;                     //long area = (long)Math.pow($,2); also valid
        System.out.println("area of square is " + area);
        sc.close();
    }
}
