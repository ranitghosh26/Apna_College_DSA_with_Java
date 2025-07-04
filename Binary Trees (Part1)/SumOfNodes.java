import java.util.*;
public class SumOfNodes {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int LeftSum= sumOfNodes(root.left);
        int RightSum= sumOfNodes(root.right);
        return LeftSum + RightSum + root.data;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println("Sum of all nodes: " + sumOfNodes(root));
    }

}
