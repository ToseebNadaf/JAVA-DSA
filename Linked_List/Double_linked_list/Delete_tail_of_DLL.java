package Linked_List.Double_linked_list;

public class Delete_tail_of_DLL {
    NodeDLL head;
    NodeDLL tail;

    public void insert_at_end(int data){
        NodeDLL newNode = new NodeDLL(data);

        if (head == null){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void delete_tail(){
        if (tail == null){
            System.out.println("The list is empty. Nothing to delete.");
            return;
        }

        if (head == tail){
            head = tail = null;
        } else {
            tail = tail.prev;
            if (tail.prev != null){
                tail.next = null;
            }
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
        Delete_tail_of_DLL list = new Delete_tail_of_DLL();

        list.insert_at_end(1);
        list.insert_at_end(2);
        list.insert_at_end(3);
        list.insert_at_end(4);

        System.out.println("Linked list before deleting the tail:");
        list.printList();

        list.delete_tail();

        System.out.println("Linked list after deleting the tail:");
        list.printList();
    }
}
