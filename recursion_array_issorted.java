public class recursion_array_issorted {

    public static boolean issorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]> arr[i+1]){
            return false;
        }
        return issorted(arr, i+1);    //  issorted(arr, i+1) -- This recursive call allows the function to check the next pair of elements in the array.
    }                                // It recursively calls issorted(arr, i+1), which becomes issorted(arr, 1). This means it will now check if the array is sorted starting from index 1.
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        System.out.println(issorted(arr, 0));
    }
}
