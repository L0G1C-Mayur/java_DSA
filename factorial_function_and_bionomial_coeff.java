public class factorial_function_and_bionomial_coeff {
    public static int factorial(int n){
        int f = 1;

        for (int i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }

public static int bio_coef(int n, int r) {
    
        int fact_n = factorial(n);  //hum ek function se dusre function ko bhi call lga sakte hai eg. like factorial
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int bio_coef = fact_n /(fact_r * fact_nmr);
        return bio_coef;
    }

    public static void main (String args[]){
        System.out.println(factorial(3));                    //factorial
        
        System.out.println(bio_coef(5,2));                //bionomial coeff....
    }
}

