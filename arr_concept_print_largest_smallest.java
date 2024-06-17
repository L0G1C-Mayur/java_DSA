public class arr_concept_print_largest_smallest {

        public static int[]findMinMax(int arr[]){    // int[] ->  Returns an array of integers (int[]) containing the minimum and maximum values found in the input array.
       
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }

        return new int[]{smallest,largest};   //Constructs and returns a new integer array containing the smallest and largest values found during the iteration.
    }
    public static void main(String[] args) {
        int arr[]= {10, 20, 30, 40, 50};

        int minMax [] = findMinMax(arr);

        System.out.println("Smallest: " + minMax[0]);
        System.out.println("Largest: " + minMax[1]);
    }

}

// easy method by return type void

/*
public class FindMinMax {
    public static void findMinMax(int[] arr) {
        // Initialize variables to hold the smallest and largest elements
        int smallest = arr[0];
        int largest = arr[0];

        // Iterate through the array to find the smallest and largest elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Print the smallest and largest elements
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        findMinMax(arr);
    }
}
 */
