public class ReverseLinkedList {

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

        public void Reverse(){
            Node prev=null;
            Node curr = head;
            Node next;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
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
        ll.Reverse();
        ll.print();
        
    }
}

    

