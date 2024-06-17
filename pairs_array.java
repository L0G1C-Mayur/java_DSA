public class pairs_array {

    public static void print_pairs(int numbers[]){

        int total_pairs = 0;

        for(int i =0; i<numbers.length;i++){
            int current = numbers[i];
            for(int j=i+1; j<numbers.length;j++){
                System.out.print("(" + current + "," + numbers[j] + ")");
                
                total_pairs++;
            }
            System.out.println();
        }
        System.out.println("total_pairs is "  + total_pairs);      // total_pairs = n(n-1)/2
    }
    public static void main(String args[]){
        int numbers[]= {2,4,6,8,10,12};
        print_pairs( numbers);
    }
}




// Not understand

/*import java.util.ArrayList;

public class PairsArray {

    public static int[][] findPairs(int numbers[]) {
        // Calculate the total number of pairs
        int totalPairs = numbers.length * (numbers.length - 1) / 2;
        int[][] pairs = new int[totalPairs][2];
        int pairIndex = 0;

        // Iterate through the array to find pairs
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                pairs[pairIndex][0] = current;
                pairs[pairIndex][1] = numbers[j];
                pairIndex++;
            }
        }

        return pairs;
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12};
        int[][] pairs = findPairs(numbers);
        
        // Print the pairs
        for (int i = 0; i < pairs.length; i++) {
            System.out.println("(" + pairs[i][0] + "," + pairs[i][1] + ")");
        }
    }
}
 */
