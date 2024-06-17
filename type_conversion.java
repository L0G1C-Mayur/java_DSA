import java.util.*;

public class type_conversion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //int number = sc.nextFloat();      int < float   ,so not possible  but  int number = (int)sc.nextFloat();
        float number = sc.nextInt();
        System.out.println(number);

        sc.close();                     // scanner object need to close.
    }
}
