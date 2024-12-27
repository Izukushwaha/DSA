import java.util.*;

class ll{

    static class Node{
        int data;
        Node next;
        

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node head;

    public void addElement(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }
        
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    // Print List :

    public void printList(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data + "\t");
            current=current.next;
        }
        System.out.println();
    }
    // Searching :
    public void searchElement(int x){
        Node current=head;
        int count=0;
        while(current!=null){
            count++;
            if(current.data==x){
                System.out.println("Element " + x + " found at position: " + count);

            }
            current=current.next;
        }
    }
    // Inseration at the beginning : 
    public void insertAtBegining(int data){
        Node newNode=new Node(data);

        newNode.next=head;
        head=newNode;

    }
    //Insertion at the end :
    public void insertionAtEnd(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
        }

        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;

    }

    // Insertion at any postion :
    public void insertionAtPos(int data, int pos){
        Node newNode=new Node(data);
        if(pos<1){
            System.out.println("Invalid Position");
            return;
        }
        
        if(pos==1){
            newNode.next=head;
            head=newNode;
            return;
        }

        int currentPos=1;
        Node current=head;
        while(current!=null && currentPos<pos-1){
            current=current.next;
            currentPos++;
        }
        if(current==null){
            System.out.println("Position out of bound");
            return;
        }
        
        newNode.next=current.next;
        current.next=newNode;
    }

    //deletion in the begining :
    public void delBegining(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }

    // Deletion in the End :
    public void delEnd(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node current=head;
        while(current.next.next!=null){
            current=current.next;
        }
        current.next=null;
    }
    public static void main(String[] args) {

        ll list = new ll();

        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter number of elements : ");
        // int n=sc.nextInt();

        // while(n>0){
        //     System.out.print("Enter element : ");
        //     int element=sc.nextInt();

        //     list.addElement(element);
        //     n--;
        //     System.out.println();
            
        // }
        // list.printList();
        // list.searchElement(1);
        list.addElement(10);
        list.addElement(20);    
        list.insertAtBegining(8798);
        list.insertionAtEnd(99);
        list.printList();
        list.insertionAtPos(34523, 1);
        // list.printList();
        // list.delBegining();
        // list.delEnd();
        list.printList();
        sc.close();
    }
}
