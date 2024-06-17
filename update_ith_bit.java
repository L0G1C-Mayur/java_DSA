public class update_ith_bit {

    public static int Clear_ith_bit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int Set_ith_bit(int n, int i){
        int bitmask = 1<<i;
        return n| bitmask;
    }

    public static int Update_ith_bit(int n, int i, int newbit){  // new bit ya to zero ho sakti hai ya to one..

        //method 1

        // if(newbit == 0){
        //     return Clear_ith_bit(n,i);
        // }
        // else{
        //     return Set_ith_bit(n,i);
        // }

        // method 2

        n = Clear_ith_bit(n,i);
        int bitmask = newbit<<i;
        return n | bitmask;
    }

    public static void main(String[] args) {
        System.out.println( Update_ith_bit(10,2,1));
    }
}
