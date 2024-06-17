public class Queue_using_array {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){    // constructor
            arr = new int [n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear == -1;  //i.e hamare queue mai ek bhi element store nhi hai
        }

        // Add
        public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }

            rear = rear + 1;
            arr[rear] = data;
        }

        // remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            // return karvana hai front ko
            int front = arr[0];   // arr[0] pe hamara front stored rehta hai
            //remove step
            for(int i=0; i<rear; i++){
                arr[i]= arr[i+1];
            }
            rear = rear-1;
            return front;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
