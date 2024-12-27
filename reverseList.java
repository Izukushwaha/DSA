public class reverseList {

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;

    public void printList(){
        Node current=head;
        while(current!=null){
            System.out.println(current);
            current=current.next;
        }
    }
    public static void main(String[] args) {
        
    }
}
