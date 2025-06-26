import java.util.LinkedList;

public class AddLinklist {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
        
    } 
    public static Node head;
    public static Node tail;

    // ADD FIRST LINKLIST

    public void  addFirst(int data){


        // Staep 1: Create a new node with the given data
        Node newNode=new Node( data);

        if (head == null) {
            head = tail = newNode; // If the list is empty, set both head and tail to the new node
        
            return; // Exit if the list was empty
            
        }

        // Step 2: newNode next= head
        newNode.next=head; //LINK

        // Step 3: head= newNode
        head=newNode;

    }


// ADD LAST LINKLIST

    public void addLast(int data){

        // Step 1: Create a new node with the given data
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode; // If the list is empty, set both head and tail to the new node
            return; // Exit if the list was empty
        }

        // Step 2: Set the next of the current tail to the new node
        tail.next = newNode;

        // Step 3: Update the tail to be the new node
        tail = newNode;
    }

    

    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
    } 
}
