public class Two_D_array_largest_no {
        public static int large(int arr[][]){
            int max = Integer.MIN_VALUE;
            for(int i =0 ; i<arr.length;i++){
                for(int j=0; j<arr[0].length;j++){
                    if(max < arr[i][j]){
                        max = arr[i][j];
                    }
                }
            }
            return max;
        }
        public static void main(String[] args) {
            int arr[][] ={{1,2,3},{4,5,6},{7,8,9}};
            System.out.println(large(arr));
        } 
    }
    
    // By returntype void 
    /*
      public class trial {
        public static void large(int arr[][]) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    if (max < arr[i][j]) {
                        max = arr[i][j];
                    }
                }
            }
            System.out.println("Largest value in the array: " + max); // Print the largest value directly
        }
    
        public static void main(String[] args) {
            int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
            large(arr); // Call the method to find and print the largest value
        }
    }
    
     */
    

