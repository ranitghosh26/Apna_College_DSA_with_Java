import java.util.*;
public class LowestCommonAncestor {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    public static boolean getPath(Node root, int n,ArrayList<Node> path){
        if(root== null){
            return false;
        }
        // Add the current node to the path
        path.add(root);

        // Check if the current node is the target node
        if(root.data==n){
            return true;
        }
        // Check in the left subtree
        boolean founndLeft = getPath(root.left, n, path);
        boolean founndRight = getPath(root.right, n, path);

        if(founndLeft || founndRight){
            return true;
        }
        path.remove(path.size()-1); // Backtrack if not found
        return false;
    }
    public static Node Lca(Node root, int n1, int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        // Fix: getPath(root, n1, path1) and getPath(root, n2, path2)
        boolean found1 = getPath(root, n1, path1);
        boolean found2 = getPath(root, n2, path2);

        // If either n1 or n2 is not present, return null
        if (!found1 || !found2) {
            return null;
        }

        // Last Common ancestor
        int i=0;
        for(; i<path1.size() && i<path2.size();i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }

        // Last equal Node -> i-1th
        Node lca = path1.get(i-1);
        return lca;
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

        int n1 = 4, n2 = 5;
        Node lca = Lca(root, n1, n2);
        if (lca != null) {
            System.out.println("LCA: " + lca.data);
        } else {
            System.out.println("LCA not found.");
        }
    }
}
