package Linked_List.Single_linked_list;

public class Find_the_length_of_linkedlist {
    Node head;

    public void insert_at_end(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            return;
        } else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }

            current.next = newNode;
        }
    }

    public int getLength(){
        int length = 0;
        Node current = head;

        while (current != null){
            length++;
            current = current.next;
        }

        return length;
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
        Find_the_length_of_linkedlist nodes = new Find_the_length_of_linkedlist();

        nodes.insert_at_end(1);
        nodes.insert_at_end(2);
        nodes.insert_at_end(3);
        nodes.insert_at_end(4);

        System.out.println("Linked list:");
        nodes.printList();

        int length = nodes.getLength();
        System.out.println("Length of the linked list: " + length);
    }
}
