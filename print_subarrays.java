public class print_subarrays {
    public static void sub_arrays(int numbers[]){

        int total_suarrays=0;

        for (int i=0;i < numbers.length;i++){
            int start=i;
            for (int j=i; j< numbers.length;j++){
                int end = j;
                for (int k= start; k<=end; k++){     // k ka kam hai sirf print karvana....
                    System.out.print(numbers[k]+" ");  //subarrays

                    total_suarrays++;
                }
                System.out.println();
            } 
            System.out.println();
        }
        System.out.println(total_suarrays);
    }
    public static void main(String args[]){
        int numbers[]= {2,4,6,8,10};
        sub_arrays(numbers);
    }
}
