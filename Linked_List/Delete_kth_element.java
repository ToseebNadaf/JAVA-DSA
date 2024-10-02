package Linked_List;

public class Delete_kth_element {
    Node head;

    public void addAtFront(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void delete_kth_element(int k){
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }

        if (k == 1) {
            head = head.next;
            return;
        }

        Node current = head;
        int count = 1;

        while (current != null && count < k - 1) {
            current = current.next;
            count++;
        }

        if (current == null || current.next == null) {
            System.out.println("k is out of bounds.");
            return;
        }

        current.next = current.next.next;

    }

    public void printLinkedList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Delete_kth_element list = new Delete_kth_element();
        list.addAtFront(5);
        list.addAtFront(4);
        list.addAtFront(3);
        list.addAtFront(2);
        list.addAtFront(1);

        System.out.println("Original linked list:");
        list.printLinkedList();

        int k = 3;
        list.delete_kth_element(k);
        System.out.println("Linked list after deleting " + k + "-th element:");
        list.printLinkedList();
    }
}
