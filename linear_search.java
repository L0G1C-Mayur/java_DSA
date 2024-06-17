public class linear_search {
    
    public static int Linearsearch(int numbers[],int key){

        for (int i=0; i<=numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;  // means hamari key exist he nhi karti...
    }
    public static void main(String args[]){
        int numbers[]= { 2, 4, 6, 8, 10, 12, 14, 16};
        int key= 10;   // to search

         System.out.println(Linearsearch(numbers,key));



        // Extra 

        // also you can do with proper way as below....

        int index = Linearsearch(numbers,key);
        if(index== -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("key is at index " + index);
        }

        // To clear the concept
        if(index >= 0){
            System.out.println("Not found");
        }
        else{
            System.out.println("key is at index " + index);
        }

    }
}
/*index == -1: This part checks if the index variable, which stores the return value from the Linearsearch method, is equal to -1.
System.out.println("Not found");: If the condition index == -1 evaluates to true (meaning the key was not found), this line prints "Not found" to the console. */

/*index >= 0: This part checks if the index variable, which stores the return value from the Linearsearch method, is greater than or equal to 0.
System.out.println("key is at index " + index);: If the condition index >= 0 evaluates to true (meaning the key was found), this line prints "key is at index " followed by the actual index value to the console. */

         