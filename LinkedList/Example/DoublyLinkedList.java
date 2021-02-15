package LinkedList.Example;

public class DoublyLinkedList {

    Node head;

    class Node {
        int data;
        Node prev;
        Node next;

        // Constructor to create a new node
        // next and prev is by default initialized as null
        Node(int d) {
            data = d;
        }
    }

    public void push(int new_data) {
        /* 1. allocate node
         * 2. put in the data */
        Node new_node = new Node(new_data);

        new_node.next = head;
        new_node.prev = null;

        /* 4. change prev of head node to new node */
        if (head != null)
            head.prev = new_node;

        /* 5. move the head to point to the new node */
        head = new_node;
    }

    // Add a node at the end of the list
    void append(int new_data) {

        /* 1. allocate node
         * 2. put in the data */
        Node new_node = new Node(new_data);

        Node last = head;

        /* 3. This new node is going to be the last node, so
         * make next of it as NULL*/
        new_node.next = null;

        /* 4. If the Linked List is empty, then make the new
         * node as head */
        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }

        /* 5. Else traverse till the last node */
        while (last.next != null)
            last = last.next;

        /* 6. Change the next of last node */
        last.next = new_node;

        /* 7. Make last node as previous of new node */
        new_node.prev = last;
    }

    public void printList(Node node) {
        Node last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.println(node.data + "");
            last = node;
            node = node.next;
        }

        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }

    /* Given a node as prev_node, insert a new node after the given node */
    public void InsertAfter(Node prev_Node, int new_data) {

        /*1. check if the given prev_node is NULL */
        if (prev_Node == null) {
            System.out.println("The given previous node cannot be NULL ");
            return;
        }

        /* 2. allocate node
         * 3. put in the data */
        Node new_node = new Node(new_data);

        /* 4. Make next of new node as next of prev_node */
        new_node.next = prev_Node.next;

        /* 5. Make the next of prev_node as new_node */
        prev_Node.next = new_node;

        /* 6. Make prev_node as previous of new_node */
        new_node.prev = prev_Node;

        /* 7. Change previous of new_node's next node */
        if (new_node.next != null)
            new_node.next.prev = new_node;
    }

    public static void main(String[] args) {

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        // Insert 6. So linked list becomes 6->NULL
        doublyLinkedList.append(6);

        // Insert 7 at the beginning. So linked list becomes 7->6->NULL
        doublyLinkedList.push(7);

        // Insert 1 at the beginning. So linked list becomes 1->7->6->NULL
        doublyLinkedList.push(1);

        // Insert 4 at the end. So linked list becomes 1->7->6->4->NULL
        doublyLinkedList.append(4);

        // Insert 8, after 7. So linked list becomes 1->7->8->6->4->NULL
        doublyLinkedList.InsertAfter(doublyLinkedList.head.next, 8);

        System.out.println("Created DLL is: ");
        doublyLinkedList.printList(doublyLinkedList.head);
    }
}
