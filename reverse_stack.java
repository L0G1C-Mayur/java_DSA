import java.util.Stack;
public class reverse_stack {
    public static void pushAtBottom(Stack<Integer>s , int data){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();  //implicit stack mai upper jate hue elements ko remove karna hai original se and store in implicit stack which is top
        pushAtBottom(s, data);  // recursion
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return; // empty stack hamesha reversed hota hai
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);       
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        reverseStack(s);
        printStack(s);
    }
}
