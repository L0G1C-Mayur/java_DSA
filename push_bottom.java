import java.util.*;
public class push_bottom {
    public static void pushAtBottom(Stack<Integer> s , int data){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();  //implicit stack mai upper jate hue elements ko remove karna hai original se and store in implicit stack,   which is top
        pushAtBottom(s, data);  // recursion
        s.push(top);
    }
    public static void main(String[] args) {
        //create stack
        Stack<Integer> s = new Stack <> ();

        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s,4);

        while(!s.isEmpty()){    // jbb tk hamara stack empty nhi ho jata, i.e isEmpty hame true nhi deta tbb tkk loop chalega
            System.out.println(s.pop());
        } 
    }
}
