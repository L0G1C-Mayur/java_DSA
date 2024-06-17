public class break_statement {
    public static void main (String args []){
        for (int i=1; i<=5;i++ ){
            if (i==3){           // it does not print 3 it prints only 2;
                break;
            }
      System.out.println(i);
        }
        System.out.println("i am out  of loop");
    }
}
