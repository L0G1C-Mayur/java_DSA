public class counting_sort {
    public static void Counting_sort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);    // Math.max(largest, arr[i]) function call is used to compare the current value of largest with the value of the array element arr[i]. The Math.max function returns the larger of the two values.
        }

        int count [] = new int[largest+1];    // created new array.   largest+1 size likha because hum idely zero se start karte hai. hum isme (0 se 7 tk jayenge)
        for (int i=0;i<arr.length;i++){      
            count[arr[i]]++;
        }

        int j=0;   // j initialize with  zero for belows code
        for(int i=0;i<count.length;i++){
            while(count[i]> 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printarr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] ={1,4,1,3,2,4,3,7};
        Counting_sort(arr);
        printarr(arr);
    }
}
