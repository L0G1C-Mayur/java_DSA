public class Queue_using_LL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node head =null;
        static Node tail =null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        // LL mai isfull ki jarurat he nhi hai because hum kitna bhi data add krr sakte hai LL mai

        // Add 
        public static void add(int data){
            Node newNode = new Node (data);
            if(head == null ){
                head = tail = newNode;
                return;
            }
            else{    // pehlese he nodes hai to 
                tail.next = newNode;           // you can write that 2 lines without using else{}
                tail = newNode;
            }
        }
        
        // remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            int front = head.data;
            // case of single element in LL
            if(tail == head){
                tail = head = null;
            }else{
                head = head.next;
            }
            return front;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
