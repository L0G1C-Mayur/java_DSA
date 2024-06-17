public class reverse_the_given_no {
    public static void main (String args []){
        int n = 10899;
        int rev =0;

        while (n > 0){
            int lastdigit = n % 10;         // call last no. of digit.
            rev = (rev*10) + lastdigit ;
            n =n /10;                      // remove last no. of digit
        }

        System.out.print(rev);
    }
}
