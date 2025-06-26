public class removefirst {


    // Node class
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList class
    static class LinkedList {
        Node head;

        // Add node at the beginning
        public void addFirst(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // Add node at the end
        public void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        // Remove the first node
        public void removeFirst() {
            if (head == null) {
                System.out.println("List is already empty......");
                return;
            }
            head = head.next;
        }

        // Print the linked list
        public void print() {
            if (head == null) {
                System.out.println("The linked list is empty.");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "--> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        System.out.println("Original list:");
        ll.print();

        ll.removeFirst();
        System.out.println("After removing first node:");
        ll.print();

        ll.removeFirst();
        System.out.println("After removing first node again:");
        ll.print();

        ll.removeFirst();
        ll.removeFirst();
        System.out.println("After removing all nodes:");
        ll.print();

        ll.removeFirst(); // Try removing from empty list
    }
}
