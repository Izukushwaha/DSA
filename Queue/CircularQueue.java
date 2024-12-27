// Implementation of Circular Queue Using Array : 

public class CircularQueue {
    static class Queue{
        int arr[];
        int size;
        int front=-1;
        int rear=-1;
    
        Queue(int size){
            this.size=size;
            arr = new int[size];
        }
    
        // Check if the Queue is empty or full :
        public boolean isEmpty(){
                return rear==-1 && front==-1;
        }
        public boolean isFull(){
            return (rear+1)%size==front;
        }

    // Enqueue :
        public void add(int data){
            if(isFull()){
                System.out.println("FULL QUEUE");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }

        // Dequeue : 
        public int remove(){
            int result=arr[front];
            if(isEmpty()){
                System.out.println("EMPTY QUEUE");
                return -1;
            }
            if(rear==front){
                rear=front=-1;
            }else front=(front+1)%size;
            return result;
        }

        // Peek : 
        public int peek(){
            if(isEmpty()){
                System.out.println("EMPTY QUEUE.");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q1=new Queue(5);
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);
        q1.remove();
        q1.add(60);
        q1.remove();
        q1.add(70);
        q1.remove();
        q1.add(80);
        q1.remove();
        q1.add(90);
        q1.remove();
        q1.add(100);

        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }

    }

}
