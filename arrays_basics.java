import java.util.*;
public class arrays_basics {
    public static void main(String args[]){

        int marks[]= new int [100];
        Scanner sc = new Scanner(System.in);

        // int phy = sc.nextInt(); 
        
        marks[0] = sc.nextInt();  //phy
        marks[1] = sc.nextInt();  //chem
        marks[2] = sc.nextInt();  //maths

        System.out.println("phy "  + marks[0]);
        System.out.println("chem " + marks[1]);
        System.out.println("math " + marks[2]);

        marks[2] = 90;   //updated

        marks [1] = marks [1]+1;    // +,-,/,%  ....etc.

        System.out.println("math " + marks[2]);
        System.out.println("chem " + marks[1]);

        int  percentage = (marks[0]+marks[1]+marks[2]) / 3;   // you can use formula also

        System.out.println("percentage" + percentage +"%");
// ***
        System.out.println("length of array " + marks.length);    // we can also measure the length of array...

        sc.close();
    }
}
