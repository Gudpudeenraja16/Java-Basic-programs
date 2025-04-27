class DoublyNode {
    int data;
    DoublyNode next;
    DoublyNode prev;

    // Constructor to create a new node
    public DoublyNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class DoublyLinkedList {
    private DoublyNode head;

    // Constructor to initialize the doubly linked list
    public DoublyLinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the end of the list
    public void insert(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null) {
            head = newNode;
        } else {
            DoublyNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    // Method to delete a node with a specific value
    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        DoublyNode temp = head;

        // If the head node itself holds the key to be deleted
        if (temp != null && temp.data == data) {
            head = temp.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        // Search for the key to be deleted
        while (temp != null && temp.data != data) {
            temp = temp.next;
        }

        // If the key was not present in the doubly linked list
        if (temp == null) {
            System.out.println("Element not found.");
            return;
        }

        // Unlink the node from the doubly linked list
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
    }

    // Method to display the linked list in forward direction
    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        DoublyNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Method to display the linked list in reverse direction
    public void displayBackward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        DoublyNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
}
public class Program24 {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        System.out.println("Doubly Linked List (Forward):");
        list.displayForward();

        System.out.println("Doubly Linked List (Backward):");
        list.displayBackward();

        list.delete(20);
        System.out.println("After deleting 20 (Forward):");
        list.displayForward();

        list.delete(40); // Element not in the list
    }
}

