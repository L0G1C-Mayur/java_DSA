import java.util.ArrayList;
public class stack_using_linkedList {
    static class Node{
        int data; 
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class stack{
        static Node head = null;

        //isEmpty
        public static boolean isEmpty(){
            return head == null;
        }

        //push
        public static void push(int data){
            Node newNode = new Node(data);
            // Base case
            if (isEmpty()){    
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        //pop
        public static int pop() {
            //Base case
            if (isEmpty()){    
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        //peek
        public static int peek(){
            //Base case
            if (isEmpty()){    
                return -1;
            }

            return head.data;
        }
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1); 
        s.push(2); 
        s.push(3);
        
        while(!s.isEmpty()){    // jbb tk hamara stack empty nhi ho jata, i.e isEmpty hame true nhi deta tbb tkk loop chalega
            System.out.println(s.peek());
            s.pop();
        }
    }
}