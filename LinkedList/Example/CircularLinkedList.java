package LinkedList.Example;

class CircularLinkedList {

    static class Node {
        int data;
        Node next;
    }

    /* Function to insert a node
        at the beginning of a Circular
        linked list */
    static Node push(Node head_ref, int data) {
        Node ptrl = new Node();
        Node temp = head_ref;
        ptrl.data = data;
        ptrl.next = head_ref;

        if (head_ref != null) {
            while (temp.next != head_ref)
                temp = temp.next;
            temp.next = ptrl;
        } else
            ptrl.next = ptrl;
        head_ref = ptrl;
        return head_ref;
    }

    static void printList(Node head) {
        Node temp = head;
        if (head != null) {
            do {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
            while (temp != head);
        }
    }

    public static void main(String[] args) {

        Node head = null;

        head = push(head, 12);
        head = push(head, 56);
        head = push(head, 2);
        head = push(head, 11);

        System.out.println("Contents of Circular " +
                "Linked List:");
        printList(head);
    }

}
