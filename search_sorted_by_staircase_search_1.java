public class search_sorted_by_staircase_search_1 {
    public static boolean staircase_search(int arr[][],int key){
        int row=0;
        int col= arr[0].length-1;

        while(row<arr.length && col>=0){
            if(key==arr[row][col]){
                System.out.println("key found at (" + row  +","+  col+ ")");
                return true;
            }
            else if(key < arr[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix [][]={{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};
        int key = 14;

        staircase_search(matrix, key); 
    }
}
