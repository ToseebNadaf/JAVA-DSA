package Linked_List.Single_linked_list;

public class Delete_tail_node {
    Node head;

    public void addAtFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void deleteTail() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
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
        Delete_tail_node list = new Delete_tail_node();
        list.addAtFront(4);
        list.addAtFront(3);
        list.addAtFront(2);
        list.addAtFront(1);

        System.out.println("Original list:");
        list.printList();

        list.deleteTail();
        System.out.println("List after deleting the tail:");
        list.printList();
    }
}
