public class spiral_matrix {
    public static void printspiral(int matrix[][]){
        int startrow = 0;    //1
        int startcolumn = 0;  //1
        int endrow = matrix.length-1; //2   1   
        int endcolumn = matrix[0].length-1; //3   2

        while(startrow<=endrow && startcolumn<= endcolumn){
            //Top
            for(int j=startcolumn; j<=endcolumn; j++){
                System.out.print(matrix[startrow][j]+" ");
            }

            //Right
            for(int i = startrow+1; i <= endrow; i++){
                System.out.print(matrix[i][endcolumn]+ " ");
            }

            //Bottom
            for(int j=endcolumn-1; j>= startcolumn;j--){
                if(startrow == endrow){        
                    break;
                }
                System.out.print(matrix[endrow][j]+ " ");
            }

            //Left
            for(int i=endrow-1; i>=startrow+1;i--){
                if(startcolumn == endcolumn){        
                    break;
                }
                System.out.print(matrix[i][startcolumn]+ " ");
            }

            startrow++;
            startcolumn++;
            endrow--;
            endcolumn--;
        }
    }
    public static void main(String args[]){
        int matrix [][]={{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};

        printspiral(matrix);                
    }
}
