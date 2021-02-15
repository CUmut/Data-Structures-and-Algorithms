package LinkedList.Example;

public class LinkedListOperations {

    Node head;

    //create a node
    class Node {
        int item;
        Node next;

        Node(int d) {
            item = d;
            next = null;
        }
    }

    /*
    ilk eleman  : head
    ikinci eleman : head.next
    üçüncü eleman : head.next.next  şeklinde tüm elemanlar üzerinde dolaşabiliriz.*/

    public void insertAtBeginning(int data) {
        //Insert the item
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    public void insertAfter(Node prev_node, int data) {
        if (prev_node == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node new_node = new Node(data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    public void insertAtEnd(int data) {
        Node new_node = new Node(data);

        if (head == null) {
            head = new Node(data);
            return;
        }
        new_node.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = new_node;
        return;
    }

    void deleteNode(int position) {
        if (head == null)
            return;

        Node node = head;
        if (position == 0) {
            head = node.next;
            return;
        }
        // Find the key to be deleted
        for (int i = 0; node != null && i < position - 1; i++)
            node = node.next;

        // If the key is not present
        if (node == null || node.next == null)
            return;
        ;

        // Remove the node
        Node next = node.next.next;
        node.next = next;

    }

    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.println(node.item + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedListOperations linkedList = new LinkedListOperations();

        linkedList.insertAtEnd(1);
        linkedList.insertAtBeginning(2);
        linkedList.insertAtBeginning(3);
        linkedList.insertAfter(linkedList.head.next, 5);

        System.out.println("Linked list: ");
        linkedList.printList();

        System.out.println("\n After deleting an element");
        linkedList.deleteNode(3);
        linkedList.printList();
    }

}
