public class Search {

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

        // Add node at a specific index
        public void add(int idx, int data) {
            if (idx == 0) {
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            Node temp = head;
            int i = 0;
            while (temp != null && i < idx - 1) {
                temp = temp.next;
                i++;
            }
            if (temp == null) {
                System.out.println("Index out of bounds");
                return;
            }
            newNode.next = temp.next;
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

        // Iterative search for a key, returns index or -1 if not found
        public int ItrSearch(int key) {
            Node temp = head;
            int i = 0;
            while (temp != null) {
                if (temp.data == key) {
                    return i;
                }
                temp = temp.next;
                i++;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1); 
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2,3);
        ll.print();
        System.out.println("Searching for 3  : " + ll.ItrSearch(3));
        System.out.println("Searching for 10: " + ll.ItrSearch(10));
    }
}
