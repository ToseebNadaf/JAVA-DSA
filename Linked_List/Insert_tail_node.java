package Linked_List;

public class Insert_tail_node {
    Node head;

    public void insert_tail_node(int data){
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printList(){
        Node current = head;
        while (current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.print("null");
    }

    public static void main(String[] args) {
        Insert_tail_node nodes = new Insert_tail_node();

        nodes.insert_tail_node(4);
        nodes.insert_tail_node(3);
        nodes.insert_tail_node(2);
        nodes.insert_tail_node(1);

        System.out.println("Linked list after inserting elements at the end:");
        nodes.printList();
    }
}
