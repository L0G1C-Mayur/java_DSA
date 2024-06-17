public class merge_sort_ll {
    public static class Node {
        int data;
        Node next;       // node type ka referance variable to pt. next node

        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;   // java bydefault initialize size as 0;   @


    public void addFirst (int data) {   //public void addFirst(int data),we did not used  public static void addFirst(int data), static keyword because we called function with help of ll which is object.   tip - main funtion is static type
    // step 1 - create new node
    Node newNode = new Node(data); 
    size++;      // @

    if (head == null){          // agar puri linklist he khali ho then
        head = tail = newNode;
        return;
    }

    //step 2 - newNode next = head.   means new node ka next abb point karega purane head ki taraf
    newNode.next = head;   //link      // next ke under is head ka referance/address store ho gya..

    // step 3 - head = newNode
    head = newNode;
}

public void print () {
    if (head == null){
        System.out.println("ll is empty");
        return;
    }
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data + " -->");
        temp = temp.next;
    }
    System.out.println("null");
}

//----
private Node getmid(Node head){
    Node slow = head;
    Node fast = head.next;

    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;     // slow ko return kiya because slow mid node hai
}

private Node merge(Node head1,Node head2){
    Node mergedLL = new Node(-1);
    Node temp = mergedLL;

    while (head1 != null && head2 != null){
        if(head1.data <= head2.data){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        else{
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
    }
    while(head1 != null){
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
    }

    while(head2 != null){
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
    }

    return mergedLL.next;
}

public Node mergeSort(Node head){
    //base case
    if(head == null || head.next == null){       // linked list is allready sorted
        return head;
    }

    //Find mid

    Node mid = getmid(head);

    //left and right sort ke liye merge sort ko call karna hai

    Node righthead = mid.next;
    mid.next = null;
    Node newLeft =mergeSort(head);
    Node newRight = mergeSort(righthead);

    // merge
    return merge(newLeft,newRight);


}

 public static void main(String[] args) {
    LinkedList ll = new LinkedList();     // ll is an object

    ll.addFirst(1);
    ll.addFirst(2);  
    ll.addFirst(3); 
    ll.addFirst(4);  
    ll.addFirst(5);
    ll.print(); 

    ll.head = ll.mergeSort(ll.head);
    ll.print();
 }
}
