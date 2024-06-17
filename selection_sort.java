public class selection_sort {
    public static void Selection_sort(int arr[]){
        for(int i=0; i<arr.length-1;i++){
          int minpos = i;    //assume karenge ki i is minimum
          for(int j = i+1; j< arr.length;j++){   // run loop to find minimum
            if (arr[minpos]>arr[j]){
                minpos=j;
            }            
          }
          //swap
          int temp = arr[minpos];
          arr[minpos]= arr[i];
          arr[i] = temp;
        }
    }

    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }  
    public static void main(String args[]){
        int arr []= {5,4,1,3,2};
        Selection_sort(arr);
        printarr(arr);
    }
}
