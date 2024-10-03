package Linked_List.Single_linked_list;

public class Search_an_element {
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

    public boolean search_an_element(int element){
        Node current = head;

        while (current != null){
            if (current.data == element){
                return true;
            }

            current = current.next;
        }

        return false;
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
        Search_an_element nodes = new Search_an_element();

        nodes.insert_at_end(1);
        nodes.insert_at_end(2);
        nodes.insert_at_end(3);
        nodes.insert_at_end(4);

        System.out.println("Linked list:");
        nodes.printList();

        int element = 3;
        boolean result = nodes.search_an_element(element);
        if (result) {
            System.out.println("Element " + element + " is found in the linked list.");
        } else {
            System.out.println("Element " + element + " is not found in the linked list.");
        }
    }
}
