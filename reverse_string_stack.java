import java.util.*;
public class reverse_string_stack {
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()){
            s.push(str.charAt(idx));   //characters ko stack mai push krr denge
            idx++;
        }

        //abb stack se character ko nikalenge and stringBuilder mai dal denge jbb tk stack empty nhi ho jata
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);   // append works, jo pop kiya hai use stringbuilder mai dal deta hai
        }

        str = result.toString();     //stringbuilder ki value ko jbb string mai store karate hai tbb toString function use karte hai
        return str;
        // else direct write ,  return result.toString();
    }
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(reverseString(str));
    }
}
