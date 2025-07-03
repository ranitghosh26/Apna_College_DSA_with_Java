
// Subtree of another Tree   :

// Given the roots of two binary trees root and subRoot, return true if there is a subtree of root
// with the same structure and node values of subRoot and false otherwise.


import java.util.*;
public class Subtree {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    public static boolean isIdentical(Node node, Node subNode){
        if(node ==null && subNode==null){
            return true;
        }
        else if(node ==null || subNode== null || node.data != subNode.data){
            return false;
        } if (isIdentical(node.left , subNode.left)) {
            return false;
        } if (isIdentical(node.right , subNode.right)) {
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root,Node subRoot){
        if( root==null){
            return false;
        }
        if(root.data== subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        boolean leftSubtree= isSubtree(root.left, subRoot);
        boolean rightSubtree= isSubtree(root.right, subRoot);
        return leftSubtree || rightSubtree;
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

    //      2
    //     / \
    //    4   5

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println("Is subRoot a subtree of root ? :  " + isSubtree(root, subRoot));
    }
    
}
