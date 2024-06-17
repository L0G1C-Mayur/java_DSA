public class bubble_sort {

    public static void Bubble_sort(int arr[]){
        int swap =0;
        for(int turn=0; turn< arr.length-1;turn++){   //outer loop is for to count turns i.e  0th,1th,2nd,3rd for this eg.
            for(int j=0;j<arr.length-1-turn;j++){  //inner check karta hai ki kaha tk swapping karna hai turn mai...
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;

                    swap++;
                }
            }
        }
        System.out.println(swap);
    }

    public static void printarr(int arr[]){
            for(int i=0; i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
    }
    public static void main(String[] args) {
        int arr []= {5,4,1,3,2};
        Bubble_sort(arr);
        printarr(arr);
    }
}
