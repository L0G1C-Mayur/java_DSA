public class bin_to_dec {
    public static void binaryTodecimal(int binNum){
        int my_no = binNum;    // suppose if we print binNum, the output shows... decimal of 0=5%  and if we make change and use my_no... it shows your main value i.e decimal of 101=5% 
        int pow = 0;
        int decNum = 0;

        while (binNum > 0){
            int last_digit = binNum % 10;

            decNum = decNum + (last_digit * (int)Math.pow(2,pow));

            pow++;
            binNum = binNum/10;
        }
        System.out.print("decimal of " + /* binNum */  my_no +"="  + decNum);
    }

    public static void main(String args[]){
        binaryTodecimal(101);
    }
}
