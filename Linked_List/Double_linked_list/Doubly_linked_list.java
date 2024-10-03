package Linked_List.Double_linked_list;

public class Doubly_linked_list {
    NodeDLL head;
    NodeDLL tail;

    public void convert_array_to_dll(int[] array) {
        for (int value : array) {
            insertAtEnd(value);
        }
    }

    public void insertAtEnd(int value) {
        NodeDLL newNode = new NodeDLL(value);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void printForward() {
        NodeDLL current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void printBackward() {
        NodeDLL current = tail;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        Doubly_linked_list list = new Doubly_linked_list();
        int[] array = {10, 20, 30, 40, 50};

        list.convert_array_to_dll(array);

        System.out.println("Doubly Linked List (Forward):");
        list.printForward();

        System.out.println("Doubly Linked List (Backward):");
        list.printBackward();
    }
}
