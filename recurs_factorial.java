public class recurs_factorial {

    public static int fact(int n){
        if(n==0){
            return 1;
        }
       int Fnm1 = fact(n-1);      // Fnm1 = n-1 m means minus
       int Fn = n * Fnm1; 

// ( In the provided code, after the line int Fn = n * Fnm1;, the control does not immediately go to the next line return Fn; 
//because there are still statements remaining in the method that need to be executed before the method returns its result.        
// which is detailed explain in below explaination... )

       return Fn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
}


// Tip - negative nos. ke liye factorial exist he nhi karta...

// explaination 
/*

Initial call: fact(5)

Since n is not 0, it enters the else block.
Calls fact(4) to calculate Fnm1.
Recursive call: fact(4)

Calls fact(3) to calculate Fnm1.
Recursive call: fact(3)

Calls fact(2) to calculate Fnm1.
Recursive call: fact(2)

Calls fact(1) to calculate Fnm1.
Recursive call: fact(1)

Calls fact(0) to calculate Fnm1.
Base case: fact(0)

Returns 1.
fact(1) computes:

Fnm1 = 1
Fn = 1 * 1 = 1
Returns 1.
fact(2) computes:

Fnm1 = 1
Fn = 2 * 1 = 2
Returns 2.
fact(3) computes:

Fnm1 = 2
Fn = 3 * 2 = 6
Returns 6.
fact(4) computes:

Fnm1 = 6
Fn = 4 * 6 = 24
Returns 24.
fact(5) computes:
Fnm1 = 24
Fn = 5 * 24 = 120
Returns 120.
Finally, the value 120 is returned to the main method and printed as the factorial of 5.

 */
