import java.util.Stack;
public class Duplicate_paren_stack {   // T.C --> O(n)
    public static boolean isDuplicate(String str){
        Stack <Character> s = new Stack<>();

        for (int i =0; i<str.length();i++){
            char ch =str.charAt(i);

            // Agar  closing ka case nhi hua to ye bydefault opening ka he case hoga so, lets see closing

            if(ch == ')'){   // closing condition
                int count =0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true;   // means duplicate exist karta hai
                }
                else{
                    s.pop();   // opening pair ko pop krr diya hai
                }
            }
            else {    // opening condition
                s.push(ch);
            }
        }
        return false;    // i.e  duplicate exist nhi karta...
    }
    public static void main(String[] args) {
        // valid strings
        String str = "((a+b))";    
        String str2 = "(a-b)";

        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));
    }
}




// this loop also written as, 

/* 
if(ch == ')'){   // closing condition
     int count =0;
     while(s.pop() != '('){
        count++;
    }
    if(count < 1){
        return true;   // means duplicate exist karta hai
    }
}
*/