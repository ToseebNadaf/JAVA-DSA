package Linked_List.Double_linked_list;

public class Insert_element_before_tail {
    NodeDLL head;
    NodeDLL tail;

    public void insert_before_tail(int value){
        NodeDLL newNode = new NodeDLL(value);

        if (head == null){
            head = tail = newNode;
        } else if (head == tail) {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        } else {
            newNode.prev = tail.prev;
            newNode.next = tail;
            tail.prev.next = newNode;
            tail.prev = newNode;
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
        Insert_element_before_tail list = new Insert_element_before_tail();

        list.insert_before_tail(1);
        list.insert_before_tail(2);
        list.insert_before_tail(3);
        list.insert_before_tail(4);

        System.out.println("Linked list after inserting elements before tail:");
        list.printList();
    }
}
