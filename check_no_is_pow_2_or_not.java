public class check_no_is_pow_2_or_not {

    public static boolean ispowoftwo(int n){
        return (n&(n-1)) == 0;  // agar value zero hai to return krr denge true, nhi to return krr denge false...
    }
    public static void main(String[] args) {
        System.out.println(ispowoftwo(4));  // eg.  4 - true , 15 - false...
    }
}
