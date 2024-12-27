
public class LinkedList {

    // Node class to represent a single node in the list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head; // Head of the linked list

    // Method to add a new node to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Static method to merge two linked lists alternately
    public static LinkedList mergeAlternating(LinkedList list1, LinkedList list2) {
        Node head1 = list1.head;
        Node head2 = list2.head;

        LinkedList result = new LinkedList();
        while (head1 != null || head2 != null) {
            if (head1 != null) {
                result.add(head1.data);
                head1 = head1.next;
            }
            if (head2 != null) {
                result.add(head2.data);
                head2 = head2.next;
            }
        }

        return result;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        // Creating the first linked list: 1 -> 2 -> 3
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // Creating the second linked list: 4 -> 5 -> 6
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // Merging the two lists
        LinkedList mergedList = mergeAlternating(list1, list2);

        // Printing the merged list
        mergedList.printList(); // Output: 1 4 2 5 3 6
    }
}
