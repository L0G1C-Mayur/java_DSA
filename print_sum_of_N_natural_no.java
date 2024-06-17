import java.util.*;

public class print_sum_of_N_natural_no {
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        
       // int i = sc.nextInt(); //   if you want sum from random no . i.e. 4 to 10
        int n = sc.nextInt();
        
        int sum =0;    // we take sum=0;  because sum = sum + i ;  i.e  sum =0 gives value of i, 
                      //and i is initial no. of counting.
        
        int i = 1;   // if you want sum from 1 

       
        while (i <= n) {
            sum += i;            // sum = sum + i;
            i++;
         } 
        System.out.println("the sum is : " + sum);
        
        sc.close();
    }
    
}
