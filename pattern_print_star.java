public class pattern_print_star {
    public static void main(String args []){

        for (int line = 1 ; line <=5; line++){
            for(int star =1; star <= line; star++){   // inner loop shows single line code *********...
                System.out.print("*");              
            }                                     
            System.out.println();
        }

    }
}
