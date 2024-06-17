public class bitmanipulation_odd_even {

    public static void odd_even(int n){
        int bitmask =1;

        if((n & bitmask) == 0){
            // even no.
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");     // if ((n & bitmask) == 1)  then odd...
        }
    }
    public static void main(String[] args) {
        odd_even(5);
        odd_even(8);
    }
}
