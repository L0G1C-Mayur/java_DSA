public class product_function {
    public static int multiply(int a, int b){
        int product = a*b;
        return product;
    }

    public static void main (String args[]){
        int a=3;
        int b=5;

        int prod = multiply(a,b);
        System.out.println(prod);

        prod = multiply(100,10);
        System.out.println(prod);

        prod = multiply(10,10);
        System.out.println(prod);

    }
}