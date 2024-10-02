package Linked_List;

public class Insert_element_at_kth {
    Node head;

    public void insert_at_kth(int data, int position){
        Node newNode = new Node(data);

        if (position == 0){
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null){
            System.out.println("The k-th position is out of bounds.");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;

    }

    public void printList(){
        Node current = head;
        while (current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Insert_element_at_kth nodes = new Insert_element_at_kth();

        nodes.insert_at_kth(11,0);
        nodes.insert_at_kth(12,1);
        nodes.insert_at_kth(13,2);
        nodes.insert_at_kth(14,3);

        System.out.println("Linked list after inserting elements at various positions:");
        nodes.printList();
    }
}
