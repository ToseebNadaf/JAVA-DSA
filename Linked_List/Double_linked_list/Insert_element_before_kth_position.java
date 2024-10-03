package Linked_List.Double_linked_list;

public class Insert_element_before_kth_position {
    NodeDLL head;
    NodeDLL tail;

    public void insert_before_kth(int value, int position){
        NodeDLL newNode = new NodeDLL(value);

        if (position <= 1 || head == null){
            insert_at_head(position);
            return;
        }

        NodeDLL current = head;
        int currentPosition = 1;

        while (current != null && currentPosition < position - 1){
            current = current.next;
            currentPosition++;
        }

        if (current == null){
            System.out.println("Position is out of bounds.");
            return;
        }

        newNode.next = current.next;
        if (current.next != null) {
            current.next.prev = newNode;
        }
        newNode.prev = current;
        current.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public void insert_at_head(int value){
        NodeDLL newNode = new NodeDLL(value);

        if (head == null){
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
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
        Insert_element_before_kth_position list = new Insert_element_before_kth_position();

        list.insert_at_head(1);
        list.insert_at_head(2);
        list.insert_at_head(3);
        list.insert_at_head(4);

        list.insert_before_kth(15, 2);
        System.out.println("Linked list after inserting before 2nd position:");
        list.printList();

        list.insert_before_kth(25, 4);
        System.out.println("Linked list after inserting before 4th position:");
        list.printList();

    }
}
