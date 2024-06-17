import java.util.*;

public class area_circle {
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    float rad = sc.nextFloat();
    float area = 3.14f * rad * rad; 
    System.out.println(area);

    char ch = 'a';
    int number = ch;                 // type conversion char to number is possible.
    System.out.println(number);
     sc.close();                     // scanner object need to close.
    }
}