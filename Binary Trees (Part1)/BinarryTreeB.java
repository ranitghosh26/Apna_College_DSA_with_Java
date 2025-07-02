import java.util.*;

public class BinarryTreeB{
    static class Node {
        int data;
        Node left;   // Fixed type
        Node right;  // Fixed type

        Node(int data){
            this.data = data;
            this.left = null;   // Initialize to null
            this.right = null;  // Initialize to null
        }
    }
    static class BinarryTree {
        static int idx = -1;
        public static Node BuildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);
            return newNode;
        }
    }
    public static void main(String[] args) {
        int nodes[] = { 1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1 };
        BinarryTree tree = new BinarryTree();
        Node root = tree.BuildTree(nodes);
        System.out.println("Build Treee: " + root.data);
    }
}

