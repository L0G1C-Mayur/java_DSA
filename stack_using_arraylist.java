import java.util.ArrayList;
public class stack_using_arraylist {
    static class Stack{
        static ArrayList <Integer> list = new ArrayList<>();

        //isEmpty
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //push
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            if(isEmpty()){      //corner case
                return -1;
            }

            int top = list.get(list.size()-1);      // 1)top nikala
            list.remove(list.size()-1);            // 2)top ko remove kiya...  last index pe jo bhi value store ye isse remove krr dega
            return top;
        }

        // peek 
        public static int peek(){
            if(isEmpty()){       //corner case
                return -1;
            }

            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1); 
        s.push(2); 
        s.push(3);
        
        while(!s.isEmpty()){    // jbb tk hamara stack empty nhi ho jata, i.e isEmpty hame true nhi deta tbb tkk loop chalega
            System.out.println(s.peek());
            s.pop();
        }
    }
}
