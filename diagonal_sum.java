public class diagonal_sum {
    public static int Diagonal_sum(int matrix[][]){   
        int sum=0;

    //     for (int i=0; i<matrix.length;i++){           // time complexity of this function is O(n^2).
    //         for (int j=0;j<matrix[0].length;j++){
    //             if(i==j){
    //                 sum+=matrix[i][j];
    //             }
    //             else if (i+j==matrix.length-1){
    //                 sum+=matrix[i][j];
    //             }
    //         }
    //     }
    //     return sum;
    // }

        for (int i=0; i <matrix.length;i++){        //  time complexity of this function is O(n).
            // prim. diagonal
            sum+= matrix[i][i];

            // sec. diagonal
            if (i != matrix.length-1-i){              // means i not equal to j. // this is condition for middle repeat element in both diagonal... 
               sum+= matrix[i][matrix.length-1-i];    // j=matrix.length-1-i.
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix [][]={{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};

       System.out.print(Diagonal_sum(matrix));    
    
    }
}
