package Linked_List.Double_linked_list;

public class Insert_element_before_head {
    NodeDLL head;
    NodeDLL tail;

    public void insert_before_head(int value){
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
        Insert_element_before_head list = new Insert_element_before_head();

        list.insert_before_head(1);
        list.insert_before_head(2);
        list.insert_before_head(3);
        list.insert_before_head(4);

        System.out.println("Linked list after inserting elements before head:");
        list.printList();
    }
}
