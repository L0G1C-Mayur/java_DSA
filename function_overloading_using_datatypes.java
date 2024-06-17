public class function_overloading_using_datatypes {
    
    //function to calc int sum
    
    public static int sum(int a, int b){
        return a+b;
    }

      //function to calc float sum

    public static float sum(float a, float b){
        return a+b;
    }

    public static void main (String args []){
        System.out.println(sum(2,3));
        System.out.println(sum(2.5f,2.5f));

    }
}
