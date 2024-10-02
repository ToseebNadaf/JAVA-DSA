package Linked_List;

public class Insert_value {
    Node head;

    public void insert_value(int data, int element){
        Node newNode = new Node(data);

        if (head == null) {
            System.out.println("The list is empty.");
            head = newNode;
            return;
        }

        if (head.data == element) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != element) {
            current = current.next;
        }

        if (current.next != null) {
            newNode.next = current.next;
            current.next = newNode;
        } else {
            System.out.println("Value " + element + " not found in the list.");
        }
    }

    public void printList(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Insert_value nodes = new Insert_value();

        nodes.insert_value(10, 1);
        nodes.insert_value(10, 10);
        nodes.insert_value(20, 10);
        nodes.insert_value(30, 20);
        nodes.insert_value(40, 20);

        System.out.println("Linked list after inserting elements:");
        nodes.printList();
    }
}
