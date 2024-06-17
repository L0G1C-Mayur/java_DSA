public class clear_last_ith_bit {

    public static int clearLastIbits(int n, int i){
        int bitmask = ((-1)<<i);
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearLastIbits(10,2));
    }
}
