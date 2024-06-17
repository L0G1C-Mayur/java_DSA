public class mem_addr {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
       // int hello[] = new int[5]; 

         System.out.println(arr.hashCode());
         System.out.println(arr);
    }
}

/*System.out.println(arr.hashCode());: This line prints the hash code of the arr array object. The hash code is a unique integer value assigned to an object by the Java runtime system. It is derived from the memory address of the object and is used for hashing-based data structures.

System.out.println(arr);: This line prints the string representation of the arr array. When you directly print an array using System.out.println(), it prints the hash code of the array object, which is the same as calling arr.toString(). This method returns a string representation of the array, which includes the memory address of the array object.

 */
