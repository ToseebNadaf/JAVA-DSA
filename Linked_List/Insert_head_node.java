package Linked_List;

public class Insert_head_node {
    Node head;

    public void insert_head_node(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
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
        Insert_head_node nodes = new Insert_head_node();

        nodes.insert_head_node(4);
        nodes.insert_head_node(3);
        nodes.insert_head_node(2);
        nodes.insert_head_node(1);

        System.out.println("Linked list after inserting elements at the head:");
        nodes.printList();
    }
}
