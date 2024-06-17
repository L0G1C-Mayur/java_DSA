public class Recur_inc_order {
    public static void printinc(int N){
        if(N==1){
            System.out.println(N);
            return;
        }
        printinc(N-1);
        System.out.println(N);
    }
    public static void main(String[] args) {
        int n =5;
        printinc(n);
    }
}
