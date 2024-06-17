import java.util.*;
import java.util.LinkedList;;
public class Deque_intro {
    public static void main(String[] args) {
        Deque <Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
       
        System.out.println(dq);

        dq.removeFirst();
        System.out.println(dq);

        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);

        dq.removeLast();
        System.out.println(dq);

        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
    }
}
