import java.util.*;

public class find_prime_no {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();

        if (n==2){
            System.out.println("no. is prime");
        }
        else{

        boolean isprime = true;       // assume that your no. is prime
        for (int i=2; i<=Math.sqrt(n); i++){        // Math.sqrt(n) it is root n
            if (n%i==0){
                isprime = false;   
                break;            // ek bhi no se divide ho to vh prime nhi hai to break he krr do...   
            }
        }
        if (isprime == true){
            System.out.println("the no. n is prime");
        }
        else {
            System.out.println("the no. n is not prime"); 
        }
     }
        sc.close();
    }

}
