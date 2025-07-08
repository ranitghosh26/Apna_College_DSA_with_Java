import java.util.*;
public class TransformToSumTree {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    public static int sumTree(Node root){
        if (root==null) {
            return 0 ;
        }
        int leftChild=sumTree(root.left);
        int rightChild=sumTree(root.right);
 
        int data= root.data;

        int newleft= root.left==null ? 0 : root.left.data;
        int newright= root.right==null ? 0 : root.right.data;

        root.data=newleft+leftChild+newright+rightChild;
        return data;

    }

    public static void preorder (Node root){
        if(root==null){
            return ;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        // Function to find the lowest common ancestor of two nodes in a binary tree
        // Example tree:
        //     1
        //     /\
        //    2  3
        //   / \ / \
        //  4  5 6  7

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

       // int n = 4; // Node whose kth ancestor you want to find
       // int k = 2; // Example: find the 2nd ancestor
        
       // System.out.print("Sum :");
        sumTree(root);
      //  System.out.print("Preoder :  :");
        preorder(root);
        
    
    }
}
