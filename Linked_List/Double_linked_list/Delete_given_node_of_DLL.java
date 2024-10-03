package Linked_List.Double_linked_list;

public class Delete_given_node_of_DLL {
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

    public NodeDLL searchNode(int value){
        NodeDLL current = head;
        while (current != null){
            if (current.data == value){
                return current;
            }

            current = current.next;
        }

        return null;
    }

    public void removeNode(NodeDLL value){
        if (value == null) {
            System.out.println("The node is null.");
            return;
        }

        if (value == head){
            head = head.next;
            if (head != null){
                head.prev = null;
            } else {
                tail = null;
            }
        } else if (value == tail) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
        } else {
            value.prev.next = value.next;
            value.next.prev = value.prev;
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
        Delete_given_node_of_DLL list = new Delete_given_node_of_DLL();

        list.insert_at_end(1);
        list.insert_at_end(2);
        list.insert_at_end(3);
        list.insert_at_end(4);

        System.out.println("Linked list before removing a node:");
        list.printList();

        NodeDLL nodeToRemove = list.searchNode(3);
        list.removeNode(nodeToRemove);

        System.out.println("Linked list after removing the node with value 30:");
        list.printList();
    }
}
