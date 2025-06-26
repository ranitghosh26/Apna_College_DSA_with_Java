public class removeLast {
    


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

        // Remove the last node
        public void removeLast() {
            if (head == null) {
                System.out.println("List is already empty.");
                return;
            }
            if (head.next == null) {
                head = null;
                return;
            }
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
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

        ll.removeLast();
        System.out.println("After removing last node:");
        ll.print();

        ll.removeLast();
        System.out.println("After removing last node again:");
        ll.print();

        ll.removeLast();
        ll.removeLast();
        System.out.println("After removing all nodes:");
        ll.print();

        ll.removeLast(); // Try removing from empty list
    }
}