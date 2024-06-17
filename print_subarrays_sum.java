public class print_subarrays_sum {
    // Brute Force
    public static void subarrays_sum(int numbers[]){
        int current_sum =0;
        int max_sum = Integer.MIN_VALUE;

        for(int i =0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                 current_sum =0;    // imp  // always initialize with zero because its value changes...
                for(int k=i; k<=j; k++){
                    current_sum+=numbers[k];     //sum
                }
                System.out.println(current_sum);  // print all arrays sum...
                if (max_sum < current_sum){                    // condition for max_sum
                    max_sum = current_sum;
                }
            }
        }
        System.out.println();
        System.out.println("max sum" + max_sum);
    }
    public static void main (String args []){
        int Numbers[]= {2,4,6,8,10};
        subarrays_sum(Numbers);
    }
}
//time complexity  O(n^3) 
