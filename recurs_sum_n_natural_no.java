public class recurs_sum_n_natural_no {

        public static int sum(int n){
            if(n==1){
                return 1;
            }
           int Fnm1 = sum(n-1);      
           int Fn = n + Fnm1;
           return Fn;
        }
        public static void main(String[] args) {
            int n = 5;
            System.out.println(sum(n));
        }
    }
    
    

