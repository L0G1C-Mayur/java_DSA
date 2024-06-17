import java.util.*;
public class functioneg2 {
   

  public static int calculate(int a, int b){    
    int sum =  a +  b;
    System.out.print(sum);
    return sum;
  }

  public static int hello(int c , int d){
    int sub = c-d;
    return sub;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    calculate(a,b);
    
    int sub = hello (c,d);
    System.out.println(sub);

    sc.close();

  }

}
    
    
  

