public class dec_to_bin {
    public static void decimalTobinary(int n){
        int my_no = n;
        int pow = 0;
        int binNum = 0;

        while(n>0){
            int remainder = n % 2;
            binNum = binNum + (remainder * (int)Math.pow(10,pow));

            pow++;

            n = n/2;  // queicent..
        }

        System.out.print("binary form of " + my_no + "=" + binNum);
    }


    public static void main(String args[]){
        decimalTobinary(7);
    }
}
