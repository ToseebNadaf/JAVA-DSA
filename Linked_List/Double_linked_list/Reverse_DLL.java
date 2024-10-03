package Linked_List.Double_linked_list;

public class Reverse_DLL {
    NodeDLL head;
    NodeDLL tail;

    public void reverse() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        NodeDLL current = head;
        NodeDLL temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }
    }

    public void insertAtTail(int value) {
        NodeDLL newNode = new NodeDLL(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }


    public void printList() {
        NodeDLL current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Reverse_DLL list = new Reverse_DLL();

        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);

        System.out.println("Original list:");
        list.printList();

        list.reverse();

        System.out.println("Reversed list:");
        list.printList();
    }
}
