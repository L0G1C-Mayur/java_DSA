public class arr_cocept2 {
    // Method to create and return an array of integers
    public static int[] createArray(int size) {
        int newArray[] = new int[size];

        // Fill the array with even numbers
        for (int i = 0; i < size; i++) {
            newArray[i] = i * 2;
        }

        // Return the created array
        return newArray;
    }

    public static void main(String[] args) {
        int arraySize = 5;

        // Call the createArray method to get an array of integers
        int[] newArray = createArray(arraySize);

        // Print the elements of the returned array
        System.out.println("Array elements:");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}


