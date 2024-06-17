import java.util.*;
public class function_type1 {
    public static void calculatesum(int num1 , int num2){
        int sum = num1+num2;
        System.out.println("the sum is " + sum);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        calculatesum(a,b);

        sc.close();
    } 
}


// ***** whole explaination*****   most imp in function...


/* 

import java.util.*;
public class j {

 1. public static int CalculateSum(int no1, int no2){
    int sum = no1 + no2;
    System.out.print(sum);
    return sum;
  }

 2. public static int Cal(int m, int n){
    int sum = m + n;
    return sum;
  }
public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
1.   CalculateSum(a,b);      //   we call direct

int c = sc.nextInt();
int d = sc.nextInt();
2.  int sum= Cal(c,d);         // but in that case, first we take int sum and store the called fun./function call 
    System.out.println(sum);               which is Cal  and then print..
}
    
    }




*/