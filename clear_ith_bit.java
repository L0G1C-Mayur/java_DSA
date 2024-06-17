public class clear_ith_bit {

    public static int Clear_ith_bit(int n, int i){

        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(Clear_ith_bit(10,2));
    }
}
