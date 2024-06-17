public class print_reverse_of_no {
    public static void main (String args[]){
        int n = 10899;

        while ( n > 0){
            int lastdigit = n % 10;
            System.out.print(lastdigit + " ");
            n = n/10;
        }
    }
}
