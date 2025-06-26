public class Palindrome {
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
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        // Function to check if the linked list is a palindrome
        public boolean checkPalindrome() {
            if (head == null || head.next == null) {
                return true; // An empty list or a single node is a palindrome
            }

            // Find the middle of the list
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Reverse the second half
            Node prev = null;
            Node curr = slow;
            while (curr != null) {
                Node nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }

            // Compare both halves
            Node firstHalf = head;
            Node secondHalf = prev;
            while (secondHalf != null) {
                if (firstHalf.data != secondHalf.data) {
                    return false;
                }
                firstHalf = firstHalf.next;
                secondHalf = secondHalf.next;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // Creating a linked list: 1 -> 2 -> 3 -> 2 -> 1
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);

        ll.print();
        System.out.println("Is Palindrome: " + ll.checkPalindrome());
    }
}
