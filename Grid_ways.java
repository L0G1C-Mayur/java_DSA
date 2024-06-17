public class Grid_ways {
    public static int gridways(int i, int j, int n, int m){    // // current cell= (i,j);
        // base case
        if(i == n-1 && j == m-1){   // condition for last cell
            return 1;
        }
        else if(i==n || j==n){     // boundary cross condition
            return 0;
        }
        int w1 = gridways(i+1, j, n, m);   //down 
        int w2 = gridways(i, j+1, n, m);  // right
        return w1+w2;
    }     
    public static void main(String[] args) {
        int n = 3,m = 3;     // rows(n)=3; col(m)=3
        System.out.println(gridways(0, 0, n, m));
    }
}
