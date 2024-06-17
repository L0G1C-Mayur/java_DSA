public class recurs_x_power_n {
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }

      /*   int xnm1 = power(x,n-1);
        int xn = x * xnm1;
        return xn;
    */  

    // this code also direct written as,

    return x * power(x,n-1);


    }
    public static void main(String[] args) {
        int x =2;
        int n= 10;

        System.out.println(power(x, n));
    }
}
