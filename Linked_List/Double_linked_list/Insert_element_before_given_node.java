package Linked_List.Double_linked_list;

public class Insert_element_before_given_node {
    NodeDLL head;
    NodeDLL tail;

    public void insert_before_node(int value, int node){
        NodeDLL newNode = new NodeDLL(value);

        if (head == null){
            System.out.println("List is empty.");
            return;
        }

        NodeDLL current = head;
        while (current != null && current.data != node){
            current = current.next;
        }

        if (current == null) {
            System.out.println("Given node with value " + node + " not found.");
            return;
        }

        if (current == head){
            insert_at_head(value);
        }

        newNode.next = current;
        newNode.prev = current.prev;
        if (current.prev != null) {
            current.prev.next = newNode;
        }
        current.prev = newNode;
    }

    public void insert_at_head(int value) {
        NodeDLL newNode = new NodeDLL(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
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
        Insert_element_before_given_node list = new Insert_element_before_given_node();

        list.insert_at_head(10);
        list.insert_at_head(20);
        list.insert_at_head(30);

        list.insert_before_node(25, 20);
        System.out.println("Linked list after inserting before node 20:");
        list.printList();

        list.insert_before_node(15, 30);
        System.out.println("Linked list after inserting before node 30:");
        list.printList();
    }
}
