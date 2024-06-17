import java.util.*;
public class creation_2D_array {
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.println("key found at " + i + "," + j);
                    return true;
                }
            }
        }
        return false;                                        
    }
    public static void main(String args[]){
        int matrix[][] = new int[3][3];           // way of writing 2D matrix
        int n = matrix.length;                   // row length
        int m = matrix[0].length;               // column length

        //input
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
                matrix[i][j]=sc.nextInt();         // access data from user
            }
        }
        System.out.println();

        //output
        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
                System.out.print(matrix[i][j] +  " ");
            }
            System.out.println();
        }

        search(matrix,8);
            sc.close();
    }
}



// Extra
/*
    int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };      3*3

    output:
    1 2 3
    4 5 6
    7 8 9 
 */