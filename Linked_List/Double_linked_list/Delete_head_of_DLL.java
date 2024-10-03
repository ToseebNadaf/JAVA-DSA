package Linked_List.Double_linked_list;

public class Delete_head_of_DLL {
    NodeDLL head;
    NodeDLL tail;

    public void insert_at_end(int value){
        NodeDLL newNode = new NodeDLL(value);

        if (head == null){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void deleteHead(){
        if (head == null){
            System.out.println("The list is empty. Nothing to delete.");
            return;
        }

        if (head == tail){
            head = tail = null;
        } else {
            head = head.next;
            if (head != null){
                head.prev = null;
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
        Delete_head_of_DLL list = new Delete_head_of_DLL();

        list.insert_at_end(10);
        list.insert_at_end(20);
        list.insert_at_end(30);
        list.insert_at_end(40);

        System.out.println("Linked list before deleting the head:");
        list.printList();

        list.deleteHead();

        System.out.println("Linked list after deleting the head:");
        list.printList();
    }
}
