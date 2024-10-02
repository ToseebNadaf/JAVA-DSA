package Linked_List;

public class Delete_head_node {
    Node head;

    public void addAtFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void deleteHead() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }

        head = head.next;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Delete_head_node list = new Delete_head_node();
        list.addAtFront(3);
        list.addAtFront(2);
        list.addAtFront(1);

        System.out.println("Original list:");
        list.printList();

        list.deleteHead();
        System.out.println("List after deleting the head:");
        list.printList();
    }
}