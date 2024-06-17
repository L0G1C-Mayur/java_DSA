public class Quick_sort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }
        // Pivot - Last element
        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx - 1); // left
        quickSort(arr, pidx + 1, ei); // right
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // i is iterator which is -1,  work of i is to make place for eles. smaller than pivot

        for (int j = si; j < ei; j++) { // start from si, because problem jb chote chote hisso mai divide hota hai,to
                                        // hamara starting index 0,1,5 kuch bhi ho sakta hai
            if (arr[j] <= pivot) {
                i++;   // -1 se 0
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // pivot ko right place pe put karne ke liye,
        i++;
        // swap
        int temp = pivot;
        arr[ei] = arr[i]; // pivot means arr[ei] .... But yaha arr[ei] ke jagah prr pivot nhi likhana,
                          // because pivot to variable hai, hame to index pr array ke under change karna
                          // hai.. variables ke change fuction ke under reflect nhi karte because
                          // functions mai call by value hota hai...
        arr[i] = temp;

        return i; // pivot ka sahi index hai i ke barabar... so, return i;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
