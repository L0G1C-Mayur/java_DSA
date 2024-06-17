public class LinkedList {
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


//---  ADD FIRST OF LINKED LIST

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

//---- ADD LAST OF LINKED LIST

    public void addLast(int data){    //  public void addLast(int data),we did not used  public static void addLast(int data), static keyword because we called function with help of ll which is object.   tip - main funtion is static type
        // step-1
        Node newNode = new Node(data);
        size++;   // @

        if(head == null){           // agar puri linklist he khali ho then
            head = tail = newNode;
            return;
        }
        // step-2 
        tail.next = newNode;
        // step-3 
        tail = newNode;
    }

//----  PRINT Linkedlist

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

//----Add tto middle of linked list between two nodes

    public void add (int idx,int data){        //add between head and tail/ between any two nodes
        if(idx == 0){             // agar index ki value zero rhi to addfirst ko call karenge
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;  // @

        Node temp =head;
        int i=0;
        while (i<idx-1){
            temp = temp.next;      // agle wale node pe jayega...
            i++;
        }

        // when i=idx-1 ; temp -->prev    i.e temp is equal to prev.

        newNode.next = temp.next;
        temp.next = newNode;
    }

//----   Remove First

    public int removeFirst(){
        if(size == 0){       //  node he nhi hogi  // linklist he khali hai
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if (size == 1){   // head and tail are same (one node)  to head ko bhi change karna padega and tail ko bhi 
            int val = head.data;
            head = tail = null;   // head ke data ko delete karne ke liye head and tail dono ko null bana diya
            size =0;  //@ imp 0
            return val;
        }
        int val = head.data;    // jis val delete karne wala hu i.e head ka data
        head = head.next;
        size--;  //@
        return val;
    }

//----   Remove Last

    public int removeLast(){
        if (size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;       // we right here head.data because head and tail pointing same/one node
            head = tail = null;
            size = 0;
            return val;
        }

        //prev: i = size-2    jaise he size-2 karenge hum prev pai poch jayenge...
        Node prev = head;
        for (int i=0;i<size-2;i++){
           prev = prev.next;
        }

        int val = prev.next.data;     // prev ke next ka data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

//----  Iterative search    O(n)

    public int itrsearch(int key){     //Iterative search    O(n)
        Node temp = head;

        int i=0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;   
    }

//----   // recursive search         time complexity = O(n)... because of helper function

    public int helper(Node head, int key){    //we create this function to execute recursion //helper function is the accual recursive function
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);      // main point... this is inner call    *dout in this line is idx mai kya store hoga
        if(idx == -1){
            return -1;
        }

        return idx+1;   // reason written in notebook...
    }

    public int recsearch(int key){
        return helper(head, key);
    }

//----   *Reverse a linked list            O(n)

    public void reverse (){        
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;     // because curr too null hua uper loop mai...
    }

//----Delete Nth from end

    public void deleteNthfromEnd(int n){        // find and remove Nth node from end...
        // calculate size 
        int sz = 0;     // size
        Node temp = head;

        while (temp != null){
            temp = temp.next;
            sz++;
        }

        //agar head ko he delete karna ho to.. (corner case)
        if (n == sz){
            head = head.next;
            return;
        }

        // in other cases: sz-n

        int i=1;                // here, we initialize with One, not with zero
        int idxTOfind = sz-n;
        Node prev = head;

        while (i<idxTOfind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

//----

    // slow-fast approach for even-odd -> TO FIND MID

    public Node findMid(Node head){      // findmid used as helper function for checkpalindrome function 
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){    //fast != null -> even , fast.next != null -> odd 
            slow = slow.next;  //+1
            fast = fast.next.next;  //+2
        }
        return slow;    //after all slow is at myMidnode...
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
        Node curr = midNode;                     // same as reverse question, just one changed happen, i.e curr initialize with midnode
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
//----    

    public static boolean iscycle(){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;  //+1
            fast = fast.next.next;  //+2
            if(slow == fast){
                return true;    // cycle exist
            }
        }
        return false;   // cycle doesn't exist...
    }

    public static void removecycle(){
        // detect cycle 
        Node slow = head;
        Node fast = head;
        boolean cycle = false;    // assume cycle exist nhi karti pehle agge loop run karne ke baad check hogi/ detect hogi ki real mai karti hai ya nhi
        while (fast != null && fast.next != null){
            slow = slow.next;  //+1
            fast = fast.next.next;  //+2
            if(slow == fast){
                   cycle = true; 
                   break;
            }
        }
        if(cycle = false){
            return;
        } 

         // find meeting points
         slow = head;
         Node prev = null;     // prev initialized with null and now we going to track prev

         while(slow != fast){       // second time meet krr gye...
            prev = fast;
            slow = slow.next;
            fast = fast.next;
         }                    
        // loop se bahar niklenge, jbb slow ki value fast ke equal hogi and then prev ke under last node store ho jayega
         
         // remove cycle --> last.next = null;
          prev.next = null;
    }

//------ Merge sort

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

        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);  
        ll.print();  
        ll.addFirst(3);  
        ll.print(); 
        ll.addFirst(4);  
        ll.print(); 
        
        ll.addLast(5);
        ll.print();
        ll.addLast(6);
        ll.print();
        ll.addLast(7);
        ll.print();
        ll.addLast(8);
        ll.print();

        ll.add(2, 5);
        ll.print();

        System.out.println(ll.size);

        ll.removeFirst();
        ll.print();

        ll.removeLast();
        ll.print();

        System.out.println(ll.itrsearch(4));
        System.out.println(ll.itrsearch(3));

        System.out.println(ll.recsearch(4));
        System.out.println(ll.recsearch(3));

       // ll.reverse();         this line is commentout to execute --> find and remove Nth node from end..
       // ll.print();

        ll.deleteNthfromEnd(3);
        ll.print();

        System.out.println(ll.checkpalindrome());

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        // meaning of above is : 1->2->3->1
        System.out.println(iscycle());
    //---------------
        head = new Node (1);
        Node temp = new Node (2);
        head.next = temp;
        head.next.next = new Node (3);
        head.next.next.next = temp;

        //  meaning of above is : 1->2->3->2

        System.out.println(iscycle());   // pehle check kiya ki cycle exist karti hai ya nhi karti
        removecycle();                   // karti hoo to remove karenge
        System.out.println(iscycle());   // firse check karenge ki cycle exist karti hai ya nhi


        //------ for merge sort

        LinkedList lll = new LinkedList(); 

        lll.addFirst(1);
        lll.addFirst(2);
        lll.addFirst(3);
        lll.addFirst(4);
        lll.addFirst(5);
        // 5->4->3->2->1

        lll.print();   // 5->4->3->2->1

        lll.head = lll.mergeSort(lll.head);
        lll.print();

    }
}


