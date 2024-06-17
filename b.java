import java.util.*;
public class b {
    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        //input 
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //output 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix[i].length; j++) {  // Use matrix[i].length instead of matrix[0].length
                System.out.print(matrix[i][j] +  " ");
            }
            System.out.println();
        }
        sc.close();
    }
}


