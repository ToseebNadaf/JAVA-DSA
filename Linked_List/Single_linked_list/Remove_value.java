package Linked_List.Single_linked_list;

public class Remove_value {
    Node head;

    public void addAtFront(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void removeElement(int valueToRemove) {
        if (head == null) {
            System.out.println("List is empty, nothing to remove.");
            return;
        }

        if (head.data == valueToRemove) {
            head = head.next;
            return;
        }

        Node current = head;

        while (current.next != null && current.next.data != valueToRemove) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Value not found in the list.");
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
        Remove_value list = new Remove_value();
        list.addAtFront(5);
        list.addAtFront(4);
        list.addAtFront(3);
        list.addAtFront(2);
        list.addAtFront(1);

        System.out.println("Original linked list:");
        list.printLinkedList();

        int valueToRemove = 2;
        list.removeElement(valueToRemove);
        System.out.println("Linked list after removing element " + valueToRemove + ":");
        list.printLinkedList();
    }
}