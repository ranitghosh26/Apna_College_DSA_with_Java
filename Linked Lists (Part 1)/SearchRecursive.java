public class SearchRecursive {
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

        public int helper(Node head,int key){
            if(head== null) {
                return -1; // Key not found
            }
            if(head.data == key) {
                return 1; // Key found
            }
            int result = helper(head.next, key);
            if(result == -1) {
                return -1; // Key not found in the rest of the list
            } else {
                return result + 1; // Key found, return the position
            }
        }

        
        public int SearchRecursive(int key) {
        return helper(head, key);   
        
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
        System.out.println("Searching for 3  : " + ll.SearchRecursive(3));
        System.out.println("Searching for 10  : " + ll.SearchRecursive(10));
    }
}
