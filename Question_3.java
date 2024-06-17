import java.util.*;
public class Question_3 {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        double total = pencil + pen + eraser;
        System.out.println("Bill is " + total);

        //  if 18% GST TAX added

        double new_total =  total + (0.18f*total);
        System.out.println("New Bill is " + new_total);

        sc.close();

    }
}
