public class Oops_method_overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum((float)1.2,(float)2.3));  // float likha kyuki inko by default double consider kiya tha 
        System.out.println(calc.sum(1,2,3));
    }
}
class Calculator{
    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b,int c){
        return a+b+c;
    }
}
