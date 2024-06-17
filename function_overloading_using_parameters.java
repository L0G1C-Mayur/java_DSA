public class function_overloading_using_parameters {

    // function to calc sum of two nums
    public static int sum(int a, int b){
        return a+b;
    }

     // function to calc sum of three nums
    public static int sum(int a, int b , int c){
        return a+b+c;
    }    

    public static void main (String args []){
        System.out.println(sum(2,3));
        System.out.println(sum(2,3,4));
    }
}
