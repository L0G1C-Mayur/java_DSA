public class recurs_optimized_pow {

    public static int optipower(int a, int n){

        if(n==0){
            return 1;
        }

      //  int halfpowsq = optipower(a,n/2) * optipower(a,n/2);  // if you write this line, it has O(n) time-complexity

        int halfpow  = optipower(a,n/2);       
        int halfpowsq =  halfpow * halfpow;       // if you execute this line,instead of above then, it has O(log n) time-complexity

        // n is odd

        if(n%2 != 0){
            halfpowsq = a * halfpowsq;
        }

        return halfpowsq;
    }
    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        
        System.out.println(optipower(a, n));
    }
}
