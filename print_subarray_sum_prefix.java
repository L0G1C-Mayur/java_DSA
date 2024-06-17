public class print_subarray_sum_prefix {
        // prefix sum 
        public static void subarrays_sum(int numbers[]){
            int current_sum =0;
            int max_sum = Integer.MIN_VALUE;

            //prefix array

            int prefix[] = new int[numbers.length];

            prefix[0] = numbers[0];   // i.e 0th index tk sirf 0 wale element ka sum hoga,lekin 1st index tk 0 and 1 ka sum hoga ...isilye niche hamne loop ko int i=0 ke bajaye, int i=1 se start kiya hai 
            // calculate prefix array

            for (int i=1; i<numbers.length;i++){
                prefix[i] = prefix[i-1] + numbers[i];   // pehle wale elements ka sum + number array ka ith element...
            }
    
            for(int i =0; i<numbers.length; i++){
                int start =i;
                for (int j=i; j<numbers.length; j++){
                    int end =j;

                    current_sum = start==0 ? prefix[end] : prefix[end]-prefix[start-1];     // means agar start zero hoga to  prefix[start-1] ye ek negative index hoga i.e prefix[0-1] = -1, aur array mai to koyi neagative index hota he nhi , so issue  bachane ke liye ternary ke help se  current_sum = start==0 ? prefix[end] : prefix[end]-prefix[start-1];  ye condition apply ki   
                    System.out.println(current_sum);         
                    if (max_sum < current_sum){                    // condition for max_sum
                        max_sum = current_sum;
                    }
                }
            }
            System.out.println();
            System.out.println("max sum " + max_sum);
        }
        public static void main (String args []){
            int Numbers[]= {1,-2,6,-1,3};
            subarrays_sum(Numbers);
        }
    }
    //time complexity  O(n^2);
    

