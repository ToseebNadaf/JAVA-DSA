package Linked_List.Double_linked_list;

public class Delete_kth_element {
    NodeDLL head;
    NodeDLL tail;

    public void insert_at_end(int value) {
        NodeDLL newNode = new NodeDLL(value);

        if (head == null){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void delete_kth_node(int position){
        if (head == null){
            System.out.println("The list is empty.");
            return;
        }

        if (position <= 0){
            System.out.println("Invalid position.");
            return;
        }

        NodeDLL current = head;
        int count = 1;

        while (current != null && count < position){
            current = current.next;
            count++;
        }

        if (current == null){
            System.out.println("Position is greater than the length of the list.");
            return;
        }

        if (current == head){
            head = head.next;
            if (head != null){
                head.prev = null;
            } else {
                tail = null;
            }
        } else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    public void printList(){
        NodeDLL current = head;
        while (current != null){
            System.out.print(current.data + " <-> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Delete_kth_element list = new Delete_kth_element();

        list.insert_at_end(11);
        list.insert_at_end(12);
        list.insert_at_end(13);
        list.insert_at_end(14);

        System.out.println("Linked list before deleting the k-th node:");
        list.printList();

        int position = 3;
        list.delete_kth_node(position);

        System.out.println("Linked list after deleting the k-th node:");
        list.printList();

    }
}
