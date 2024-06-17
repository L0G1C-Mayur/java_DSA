import java.util.*;
public class function_type2 {
    public static int calculatesum(int num1 , int num2){      //(parameters/formal parameters)
        int sum = num1+num2;
        return sum;
    }

     //*****METHOD-1******
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

         int a = sc.nextInt();
         int b = sc.nextInt();

        int sum = calculatesum(a,b);     //(argument/actual parameters)
        System.out.println("the sum is " + sum);

        sc.close();
    } 
}


     //*****METHOD-2******

// Also we can put direct values in (argument/actual parameters)


// public static void main(String args[]){
//     Scanner sc = new Scanner (System.in);

//     int sum = calculatesum(2,2);     //(argument/actual parameters)
//     System.out.println("the sum is " + sum);
// } 




    //*****METHOD-3******

//ALSO WE CAN DO..... imp...


// public static void main(String args[]){
//     Scanner sc = new Scanner (System.in);

//      int a = sc.nextInt();
//      int b = sc.nextInt();

//       System.out.println("the sum is " + calculatesum(a,b)); 
// }