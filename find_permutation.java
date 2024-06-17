public class find_permutation {
    public static void FindPermutation(String str, String ans){
        // Base case 
        if(str.length() ==0){
            System.out.println(ans);
            return;
        }
        // recursion (kaam)
        for (int i=0; i<str.length();i++){
            char curr = str.charAt(i);   //hame curr char ko ans ke under add karna hai,add karne se pehle str ke under se curr character ko delete kare...
            //"abcde" = "ab" + "bc" = "abde" // c to completly gayab ho gya.... likewise i ko bhi hatana hai...

            String NewStr = str.substring(0, i)+ str.substring(i+1);  // str.substring(i+1,  ) --> end mai kuch na likhe to vh (length-1) he hota hai

            FindPermutation(NewStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        FindPermutation(str,"");
    }
}
