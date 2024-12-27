import java.util.*;

public class QueueStack {
    static class Queue{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty(){
            return s1.isEmpty();
        }

        public void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public int remove(){
            if(s1.isEmpty()){
                System.out.println("EMPTY QUEUE.");
                return -1;
            }
            return s1.pop();
        }
        public int peek(){
            if(s1.isEmpty()){
                System.err.println("EMPTY QUEUE.");
                return -1;
            }
            return s1.peek();
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
