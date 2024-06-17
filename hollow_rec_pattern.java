public class hollow_rec_pattern {
    public static void hollow_rectangle(int total_rows, int total_columns){
        // outer loops
        for(int i=1; i<=total_rows; i++){
            //inner cloums 
            for(int j=1; j<=total_columns; j++){
                // cell(i,j)
                if ( i==1 || i == total_rows || j==1 || j == total_columns){
                    //boundry cells
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main (String args[]){
        hollow_rectangle(4,5);
    }
}
