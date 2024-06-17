public class primes_in_range {
    public static boolean isprime(int n){
        if (n==2){
            return true;
        }
        for (int i=2; i<= Math.sqrt(n); i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primesInrange(int n){
        for(int i=2; i<=n; i++){
            if (isprime(i)){   //if isprime true then only prints... 
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
        primesInrange(100);   // 2 to 100 prime no....
    }
}
