public class deleteNthfromEnd {
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

    public void addFirst(int data) {
        // step 1 - create new node
        Node newNode = new Node(data);
        size++; // @

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 - newNode next = head. means new node ka next point karega purane head
        // ki taraf
        newNode.next = head; // link // next ke under is head ka referance/address store ho gya..

        // step 3 - head = newNode
        head = newNode;
    }

    public void deleteNthfromEnd(int n) { // find and remove Nth node from end..
        // calculate size
        int sz = 0; // size
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        // agar head ko he delete karna ho to..
        if (n == sz) {
            head = head.next;
            return;
        }

        // in other cases: sz-n

        int i = 1;
        int idxTOfind = sz - n;
        Node prev = head;

        while (i < idxTOfind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
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
        deleteNthfromEnd ll = new deleteNthfromEnd(); // ll is an object
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.deleteNthfromEnd(3);
        ll.print();

    }
}
