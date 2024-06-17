public class divide_conq_merge_sort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // kaam
        int mid = si + (ei - si) / 2; // mid
        mergeSort(arr, si, mid); // left part
        mergeSort(arr, mid + 1, ei);        // right part of left array first

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        // assume for size --> left(0,3) = 4 elements , right(4,6) = 3 elements ,
        // To temp ko 7 jagah chahiye hogi.. i.e size=7 i.e  (6-0+1) = 7
        int temp[] = new int[ei - si + 1]; 
        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp array

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) { // arr[i]-left part comparing arr[j]-right part
                temp[k] = arr[i];
                i++;
                // k++;
            } else {
                temp[k] = arr[j];
                j++;
                // k++;
            }
            k++; // ye dono condition mai ho rha hai to yha likha
        }


        // agar left part mai kuch bacha hoga,uper wala loop run karne ke baad bhi...
        // then,
        while (i <= mid) {
            temp[k++] = arr[i++]; 
        }

        // agar right part mai kuch bacha hoga uper wala loop run karne ke baad bhi...
        // then,
        while (j <= ei) {
            temp[k++] = arr[j++];
        }


        // Now, copy temp to my original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k]; // iis line se temp array ki values original array mai copy ho jayegi
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8, -2 };
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
