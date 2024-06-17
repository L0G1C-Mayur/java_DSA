public class circular_queue_using_array {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) { // constructor
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;   // i.e hamare queue mai ek bhi element store nhi hai
        }

        public static boolean isfull(){
            return (rear+1) % size == front;   // rear ke agge he fron hai...
        }

        // Add
        public static void add(int data) {
            if (isfull()) {
                System.out.println("Queue is full");
                return;
            }

            // Add first element
            if(front== -1){
                front = 0;
            }
            rear = (rear+1) % size;
            arr[rear] = data;
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int result = arr[front];
            // last ele. delete
            if(rear == front){
                rear = front = -1;
            }
            else{
                front = (front+1) % size;
            }
            return result;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
