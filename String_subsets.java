public class String_subsets {
    public static void findSubsets(String str, String ans,int i){
        //base case 
        if(i == str.length()){

            if(ans.length()== 0){    // 0 means empty i.e for empty string  " "
                System.out.println("null");
            }
            else {
                System.out.println(ans);
            }
            return;
        }

        // recursion (kaam) 
        // yes choice
        findSubsets(str, ans+str.charAt(i),i+1);

        // No choice 
        findSubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str,"", 0);     // At starting ans is empty string i.e "".... if you write " " with gap then it will not show "null" in output
    }
}
