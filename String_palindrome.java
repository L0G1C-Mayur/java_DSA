public class String_palindrome {                 // O(n)
    public static boolean ispalindrome(String str){
        int n = str.length();
        for(int i=0; i<(str.length())/2;i++){
            if(str.charAt(i) != str.charAt(n-i-1)) {               // comparing first and last letters...
                return false;
            }           
        }
        return true;
    }

    // public static void printme(String str){
    //     for(int i=0; i<(str.length())/2;i++){
    //         if((ispalindrome(str.substring(i)))){   // learn ahead...
    //             System.out.println(i);
    //         }
    //     }
    // }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(ispalindrome(str));
         //printme(str); 
    }
}
