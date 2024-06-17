public class arrays_concept {
    
/*In call by value, a copy of the value of a variable is passed to the method. Any changes made to the parameter inside the method do not affect the original variable.

public class CallByValueExample {
    public static void main(String[] args) {
        int num = 10;
        modifyValue(num);
        System.out.println("Original value: " + num); // Output will be 10
    }

    public static void modifyValue(int n) {
        n = n * 2;
        System.out.println("Modified value inside method: " + n); // Output will be 20
    }
}
 */

 /*   When you pass an array to a method in Java, you are passing the reference (or memory address) of the array, not a copy of the entire array itself. This means that changes made to the elements of the array inside the method will affect the original array, as they are operating on the same underlying array object.

 In Java, arrays are objects, and when they are passed as arguments to methods, the reference to the array is passed, not the actual array itself. This is often referred to as "pass by value" because the value of the reference is passed, not the value of the elements in the array

 public class CallByReferenceExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        modifyArray(arr);
        System.out.println("Original array: " + Arrays.toString(arr)); // Output will be [10, 20, 30, 40, 50]
    }

    public static void modifyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 10;
        }
        System.out.println("Modified array inside method: " + Arrays.toString(arr)); // Output will be [10, 20, 30, 40, 50]
    }
}


When you pass an array to a method in Java, you are passing the reference (or memory address) of the array, not a copy of the entire array itself. This means that changes made to the elements of the array inside the method will affect the original array, as they are operating on the same underlying array object. 

However, if you reassign the reference to a new array inside the method, it won't affect the original array outside the method because only the copy of the reference was passed, not the actual reference itself.
means,

public class ArrayExample {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        
        // Passing the original array to a method
        modifyArray(originalArray);
        
        // Printing the original array after the method call
        System.out.println("Original array after method call: " + Arrays.toString(originalArray));
    }
    
    public static void modifyArray(int[] arr) {
        // Reassigning the reference to a new array
        arr = new int[]{10, 20, 30, 40, 50};
        
        // Printing the modified array inside the method
        System.out.println("Modified array inside the method: " + Arrays.toString(arr));
    }
}
OUTPUT OF ABOVE :

Modified array inside the method: [10, 20, 30, 40, 50]
Original array after method call: [1, 2, 3, 4, 5]


// extra...
if you have an array arr containing [1, 2, 3, 4, 5], calling Arrays.toString(arr) on it will return the string "[1, 2, 3, 4, 5]". This string can then be printed to the console or used in other parts of the program as needed.
*/

}