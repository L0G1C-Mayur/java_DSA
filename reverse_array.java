public class reverse_array {

    public static void reverse(int numbers[]){
        int start =0 ; int end = numbers.length-1;

        while( start<=end){
            // swap
            int temp = numbers[end];
            numbers[end]= numbers[start];
            numbers[start]=temp;

            start ++;
            end--;
        }
    }  

    public static void print(int numbers[]){
        reverse(numbers);
        for (int i =0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
    }
    public static void main(String args []){
        int numbers[]= {1,2,3,4,5};
        print(numbers);
    }   
}


// Also we can solve by int[] array returntype 

/*
 public class ReverseArray {

    public static int[] reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move start towards the end and end towards the start
            start++;
            end--;
        }

        // Return the reversed array
        return arr;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        System.out.println("Original array:");
        printArray(arr);

        int reversed[] = reverse(arr);

        System.out.println("Reversed array:");
        printArray(reversed);
    }
}
*/
