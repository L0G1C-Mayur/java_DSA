public class palindrome_linkList {
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

        // slow fast approach for even-odd

    public Node findMid(Node head){      // helper function used for palindrome
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;  //+1
            fast = fast.next.next;  //+2
        }
        return slow;    //slow is myMidnode
    }

        public boolean checkpalindrome(){
            // Base case
            if(head == null || head.next == null){
                return true;
            }
            // step 1 - find mid 
            Node midNode = findMid(head);              // findMid function called... we get mid from that
    
            // step 2 - reverse 2nd half
            Node prev = null;
            Node curr = midNode;
            Node next;
    
            while (curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node right = prev;  // right half head
            Node left = head;   // left half head
    
            // step 3 - check left_half and rigth_half
            while(right != null){
                if(left.data != right.data){
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
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
            palindrome_linkList  ll = new palindrome_linkList (); // ll is an object
            ll.addFirst(1);
            ll.addFirst(2);
            ll.addFirst(2);
            ll.addFirst(1);
            ll.print();
            System.out.println(ll.checkpalindrome());
            ll.print();
    
        }
    }

