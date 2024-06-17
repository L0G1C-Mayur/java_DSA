public class count_set_bit {

    public static int countsetbits(int n){

        int count =0;
        while(n>0){
            if( ( n&1 ) != 0){    //  ( n&1 ) != 0  from that we check our LSB
                count++;
            }
           n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countsetbits(15));
    }
}
