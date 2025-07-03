import java.lang.ProcessHandle.Info;

public class DiameterOfTree2nd {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    static class Info{
        int ht;
        int dim;

        public Info(int ht, int dim) { // Move constructor inside Info class
            this.ht = ht;
            this.dim = dim;
        }
    }

    public static Info diameter(Node root){
        if(root == null){
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
        int dimThroughRoot = leftInfo.ht + rightInfo.ht + 1;
        int dim = Math.max(dimThroughRoot, Math.max(leftInfo.dim, rightInfo.dim));
        return new Info(ht, dim);
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
        
        System.out.println("Diameter of the tree is: " + diameter(root).dim);
    }
    
}
