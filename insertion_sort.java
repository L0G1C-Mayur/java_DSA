public class insertion_sort {
    public static void Insertion_sort(int arr[]){
        for (int i=1;i<arr.length;i++){     
            int key= arr[i];    // key ko temp. mai store karenge
            int prev = i-1;

            // finding out correct position to insert
            while(prev>=0 && arr[prev]>key){
                arr[prev+1]=arr[prev];
                prev--;
            }
            // insert the key value

            arr[prev+1]=key;
        }
    }

    public static void printarr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main (String args[]){
        int arr []= {5,4,1,3,2};
        Insertion_sort(arr);
        printarr(arr);
    }
}
