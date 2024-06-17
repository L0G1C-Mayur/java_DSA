import java.util.LinkedList;
public class JCF {
    public static void main(String[] args) {
        //create
        LinkedList<Integer> ll = new LinkedList<>();   // Objects -> Integer, Float, Character

        // add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        ll.add(2,3);
        // 0->1->2
        System.out.println(ll);

        // remove 
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
