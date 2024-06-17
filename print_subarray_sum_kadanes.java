public class print_subarray_sum_kadanes {
    public static void kadanes(int arr[]){
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;

        for (int i=0; i<arr.length;i++){
            curr_sum = curr_sum + arr[i];
            if(curr_sum<0){
                curr_sum=0;
            }
            max_sum = Math.max(max_sum, curr_sum);  // curr_sum and max_sum se jo bhi maximum hoga vh max_sum mai jake store hoga
        }
        System.out.println("our max_sum of subarray is " + max_sum);
    } 
    public static void main(String[] args) {
        int arr[] ={-2,-3,4,-1,-2,1,5,-3};
        kadanes(arr);
    }
}
