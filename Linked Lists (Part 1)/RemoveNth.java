public class RemoveNth {

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

        // Print the linked list
        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "--> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        // Remove Nth node from end of list
        public void removeNthFromEnd(int n) {
            // First, calculate the size of the list
            int size = 0;
            Node temp = head;
            while (temp != null) {
                temp = temp.next;
                size++;
            }

            if (n > size || n <= 0) {
                System.out.println("Invalid n value.");
                return;
            }

            // If we need to remove the first node
            if (n == size) {
                head = head.next;
                return;
            }

            // Find the node before the one to remove
            int i = 1;
            int itoFind = size - n;
            Node prev = head;
            while (i < itoFind) {
                prev = prev.next;
                i++;
            }
            // Remove the nth node from end
            if (prev.next != null) {
                prev.next = prev.next.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        System.out.println("Original list:");
        ll.print();

        ll.removeNthFromEnd(2);
        System.out.println("After removing 2nd node from end:");
        ll.print();

        ll.removeNthFromEnd(3);
        System.out.println("After removing 3rd node from end:");
        ll.print();
    }
}
