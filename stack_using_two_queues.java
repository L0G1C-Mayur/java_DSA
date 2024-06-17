import java.util.*;
import java.util.LinkedList;
public class stack_using_two_queues {
    static class stack{
        static Queue <Integer> q1 = new LinkedList<>();
        static Queue <Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();     // stack ke case mai sirf ek stack check kiya tha but issme 2 bhi check krr rhe hai because hum nhi guess krr sakte ki,  ele. konse queue mai honge / end mai element kis queue mai hoga....
        }

        public static void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }
            else{
                q2.add(data);
            }
        }

        public static int pop(){
            if(q1.isEmpty()){
                System.out.println("Empty stack");
                return -1;
            }

            int top = -1;
            // q1 se tbb tkk pop karenge jbb tkk hum last ele. tkk nhi pohch jate and uun saro hum q2 mai dal denge...
            
            //case 1
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }
            else{ // case 2
                while(!q2.isEmpty()){
                    top = q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        public static int peek(){
            if(q1.isEmpty()){
                System.out.println("Empty stack");
                return -1;
            }

            int top = -1;
           
            //case 1
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    q2.add(top);
                }
            }
            else{ // case 2
                while(!q2.isEmpty()){
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}