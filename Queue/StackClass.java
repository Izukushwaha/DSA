import java.util.*;

public class StackClass {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stacks{
        public static Node head;
        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(int data){
            Node newNode = new Node(data);
            newNode.next=head;
            head=newNode;
        }
        public static int pop(){
            if(isEmpty()){
                System.out.println("Empty Stack");
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Stack");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stacks s1=new Stacks();
        
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);

        while(!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }
        
// Stack using collection framwork :

        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());

    
        
    }
}
