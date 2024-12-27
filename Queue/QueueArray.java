// Implementation of Linear Queue using Array : 

public class QueueArray {
    static class Queue{
        int arr[];
        int size;
        int rear=-1;

        Queue(int size){
            this.size=size;
            arr=new int[size];
        }

        // Cheack if its empty or full : 
        public boolean isEmpty(){
            return rear==-1;
        }
        public boolean isFull(){
            return rear==size-1;
        }

        // Enqueue : 
        public void add(int data){
            if(isFull()){
                System.out.println("FUll QUEUE.");
                return;
            }
            rear++;
            arr[rear]=data;
        }

        // Dequeue : 
        public int remove(){
            if(isEmpty()){
                System.out.println("EMPTY QUEUE.");
                return -1;
            }
            int front=arr[0];
            for(int i=0; i<rear; i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }

        // PEEK : 
        public int peek(){
            if(isEmpty()){
                System.out.println("EMPTY QUEUE.");
                return -1;
            }
            int front=arr[0];
            return front;
        }
    }

    public static void main(String[] args) {
        Queue q1 = new Queue(5);
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);
        q1.add(76476);

        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}
