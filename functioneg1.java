import java.util.*;
public class functioneg1 {
  public static int CalculateSum(int no1, int no2){
    int sum = no1 + no2;
    System.out.print(sum);
    return sum;
  }

   public static int Cal(int m, int n){
    int sum = m + n;
    return sum;
  }
public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
    CalculateSum(a,b);

int c = sc.nextInt();
int d = sc.nextInt();
    int sum= Cal(c,d);
    System.out.println(sum);

    sc.close();
}
    
    }

