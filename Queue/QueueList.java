public class QueueList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Queue{
        static Node head=null;
        static Node tail=null;

        // Check if Queue is empty or not : 
        public boolean isEmpty(){
            return head==null && tail==null;
        }

        // Enqueue :
        public void add(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head=tail=newNode;
                return;
            }else{
                tail.next=newNode;
                tail=newNode;
            }
        }

        // Dequeue : 
        public int remove(){
            if(isEmpty()){
                System.out.println("EMPTY LIST");
                return -1;
            }
            int front=head.data;
            if(head==tail){
                head=tail=null;
                return front;
            }
            head=head.next;
            return front;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("EMPTY QUEUE.");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);

        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}
