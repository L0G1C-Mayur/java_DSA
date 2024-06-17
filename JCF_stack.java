import java.util.*;
public class JCF_stack {
    public static void main(String[] args) {
        Stack<Integer>s = new Stack<>();       // imp Line  (JCF)  // Stack --> S is capital
        s.push(1); 
        s.push(2); 
        s.push(3);
        
        while(!s.isEmpty()){    // jbb tk hamara stack empty nhi ho jata, i.e isEmpty hame true nhi deta tbb tkk loop chalega
            System.out.println(s.peek());
            s.pop();
        }
    }
}
