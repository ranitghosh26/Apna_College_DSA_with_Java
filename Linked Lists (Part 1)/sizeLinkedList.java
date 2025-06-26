// public class sizeLinkedList {
    
// }
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Function to add a new node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Function to calculate the size of the linked list
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}

public class sizeLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding elements to the linked list
        list.add(10);
        list.add(20);
        list.add(30);
        
        // Getting the size of the linked list
        int size = list.size();
        System.out.println("Size of the linked list: " + size);
    }
}
