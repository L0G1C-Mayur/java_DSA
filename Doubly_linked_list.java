public class Doubly_linked_list {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node (int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //addFirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        // Base case
        if(head == null){
            head = tail = newNode;
            return; 
        }

        newNode.next =head;
        head.prev = newNode;
        head = newNode; 
    }

    // RemoveFirst
    public int removeFirst(){
        // Base case 
        if(head == null){
            System.out.println("ddl is empty");
            return Integer.MIN_VALUE;   //  return Integer.MIN_VALUE; means koyi valid data nhi tha kisi node ke under
        }
        // Base case 
        if(size == 1){    // single node  
            int val = head.data;
            head = tail = null;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;       //agar single node hogi to ye line error show karegi. so, hamne uper base case banaya hai
        return val;
    }

    public void print(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data + "<-->");
            temp = temp.next;
        }
            System.out.print("null");
    }

    // Reverse DLL
    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        Doubly_linked_list dll = new Doubly_linked_list();

        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();

        dll.removeFirst();
        System.out.println();
        dll.print();

        dll.reverse();
        System.out.println();
        dll.print();
    }
}

// HW ->  perform addLast and removeLast
