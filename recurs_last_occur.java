public class recurs_last_occur {
    public static int last_occur(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }

        int isfound = last_occur(arr, key, i + 1); // ye line batayega ki baad mai key exist karti hai ya nhi...

        if (isfound == -1 && arr[i] == key) {
            return i;
        }

        return isfound;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 9, 5, 2, 5, 3 };
        System.out.println(last_occur(arr, 14, 0));
    }
}
