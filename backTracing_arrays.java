public class backTracing_arrays {
    public static void changeArr(int arr[],int i, int val){    
        // Base case
        if(i==arr.length){
            printArr(arr);    // first arr
            return;
        }
        // Recursion (kaam)
        arr[i]= val;
        changeArr(arr, i+1, val+1);     // function call step
        arr[i] = arr[i]-2;             // backtracking steps
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);           // starting Idx. i, starting value=1
        printArr(arr);      // second arr
    }
}
