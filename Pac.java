public class Pac {
    static class Queue {
        int arr[];
        int size;
        int rear = -1;

        // Constructor to initialize the queue
        Queue(int size) {
            this.size = size;
            arr = new int[size];
        }

        // Check if the queue is empty
        public boolean isEmpty() {
            return rear == -1;
        }

        // Check if the queue is full
        public boolean isFull() {
            return rear == size - 1;
        }

        // Enqueue: add data to the queue
        public void add(int data) {
            if (isFull()) {
                System.out.println("FULL QUEUE.");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // Dequeue: remove data from the front of the queue
        public int remove() {
            if (isEmpty()) {
                System.out.println("EMPTY QUEUE.");
                return -1;
            }
            int front = arr[0];
            
            // Shift all elements to the left after removal
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        // Peek: get the front element of the queue
        public int peek() {
            if (isEmpty()) {
                System.out.println("EMPTY QUEUE.");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q1 = new Queue(5);
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);

        // This is where the queue is full, and trying to add another element
        q1.add(76476); // This will print "FULL QUEUE."
    }
}
