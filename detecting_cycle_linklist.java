public class detecting_cycle_linklist {
    public static class Node {
        int data;
        Node next; // node type ka referance variable to pt. next node

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size; // java bydefault initialize size as 0; @


    //1 floy's cycle finding algorithm 
    public static boolean iscycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                return true; // cycle exist
            }
        }
        return false; // cycle doesn't exist...
    }

    public void print() {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        detecting_cycle_linklist ll = new detecting_cycle_linklist(); // ll is an object
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        // meaning of above is : 1->2->3->1
        System.out.println(iscycle());
    }
}


// imp. 
/*public static boolean isCyclic() { }: This method is declared as a static method. Static methods belong to the class itself rather than to any specific instance of the class. They can be called directly using the class name without needing to create an object of the class. In this case, isCyclic() can be called using the class name, for example, ClassName.isCyclic(), without creating an instance of the class.
public boolean isCyclic() { }: This method is an instance method, meaning it belongs to a specific instance of the class. It must be called on an object of the class, and it operates on the specific state of that object. In this case, isCyclic() can only be called on an instance of the class, for example, objectName.isCyclic().*/