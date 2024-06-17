import java.util.*;
public class next_greater_stack {
    public static void main(String[] args) {
        int arr [] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int Next_greater [] = new int[arr.length];

        for(int i = arr.length-1; i>=0; i--){

            // step-1   while
            while(!s.isEmpty() &&  arr[s.peek()] <= arr[i]){
                s.pop();
            }

            // step-2   if-else 
            if(s.isEmpty()){
                Next_greater[i] = -1;
            }
            else{
                Next_greater[i] = arr[s.peek()];    // [ ] iske under ki value index hota hai... 
            }
            
            // step-3   push in stack
            s.push(i);
        }

        for(int i =0; i< Next_greater.length; i++){
            System.out.print(Next_greater[i]+ " ");
        }
    }
}
