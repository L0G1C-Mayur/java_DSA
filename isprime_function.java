public class isprime_function {
    public static boolean isPrime(int n) {

         //corner case 

        if (n==2){
           return true;
       } 

        boolean isPrime = true;

        for (int i=2; i<=n-1; i++){
            if (n%i==0){
             isPrime = false;
             break;
          }
        }
        return isPrime;
    }

// also we can write  code as.....

    // public static boolean isPrime(int n) {

    //     for (int i=2; i<=n-1; i++){
    //         if (n%i==0){
    //          isPrime = false;
    //          return false;
    //       }
    //     }
    //     return true;
    // }


public static void main (String args[]){
    System.out.println(isPrime(2));

 }

}