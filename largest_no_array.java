//import java.util.*;
public class largest_no_array {

    public static int largest_no(int numbers[]){
        int largest = Integer.MIN_VALUE;  // - infinity

        for (int i=0; i<numbers.length; i++){
            if (largest<numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;           // function se ek he thing return ho sakti hai
    }
    
    public static void main(String args[]){
        int numbers[]= {2,4,6,8,10,12,14,200};

        System.out.print(largest_no(numbers));

    }
}

// For smallest -- use smallest in the place of largest and make change in  int smallest = Integer.MAX_VALUE; 


//  IMP- if I want to  return both largest and smallest

/*
public class trial {
    public static int[]findMinMax(int arr[]){    // int[] ->  Returns an array of integers (int[]) containing the minimum and maximum values found in the input array.  It indicates that the method will return an array of integers.

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
        return new int[]{smallest, largest};   //Constructs and returns a new integer array containing the smallest and largest values found during the iteration.
    }

    public static void main(String[] args) {
        int arr[]= {10, 20, 30, 40, 50};
        int[] minMax = findMinMax(arr);
        System.out.println("Smallest: " + minMax[0]);
        System.out.println("Largest: " + minMax[1]);
    }
}
 */