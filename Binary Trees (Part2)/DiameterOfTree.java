import java.util.*;
public class DiameterOfTree {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    public static int height(Node node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.max(leftHeight, rightHeight) + 1; // Fixed: should return max, not sum
    }
    public static int diameter( Node root){
        if(root==null){
            return 0;
        }
        int leftDiameter = diameter(root.left);
        int leftHeight = height(root.left);
        int rightDiameter = diameter(root.right);
        int rightHeight = height(root.right);
        // Diameter of the tree is the maximum of:
        int selfDiameter = leftHeight + rightHeight + 1;
        
        return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));
    }

    public static void main(String[] args) {
        // Example usage

    //     1
    //    / \
    //   2   3
    //  / \  / \
    // 4   5 6   7

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Diameter of the tree is: " + diameter(root));
    }

    
}