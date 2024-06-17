public class recurs_binary_string {
    public static void binary_string(int n, int last_place, String str){
        // base case 
        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam
        /* if(last_place == 0){   
            binary_string(n-1,0, str +"0");       
            binary_string(n-1,0, str +"1");       
        }
        else{
            binary_string(n-1,0, str +"0");       // because last_place == 1;
        } */

        
        // also we can directly write in short as,

         binary_string(n-1,0, str +"0"); 
         if(last_place == 0){
            binary_string(n-1,1, str +"1"); 
         }

    } 
    public static void main(String[] args) {
        binary_string(3, 0,"");
    }
}
