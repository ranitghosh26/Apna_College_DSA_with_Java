



public class AddMiddle {

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

        public void  AddMiddle(int idx, int data){
        Node newNode = new Node(data);
        Node temp = head;
        int  i=0;
        

        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
}
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
    
        ll.addFirst(2);
    
        ll.addFirst(1);
    
        ll.addLast(3);
        
        ll.AddMiddle(2,9);
        System.out.println("Print the linked list after adding 9 at index 2");
        // Print the linked list after adding 9 at index 2
        // Adding 5 at index 2
    }
}

