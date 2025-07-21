import java.util.*;
public class ConvertBSTtoBalancedBST {

    static class Node {
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data= data;
        }
    }
    public static void preorder(Node root) {
        if(root == null) return;
        
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    // ==============================================

    public static void getInOrder(Node root,ArrayList<Integer> inorder){
        if(root == null ) return ;

        getInOrder(root.left, inorder);
        inorder.add(root.data);
        getInOrder(root.right, inorder);
    }
    public static Node createBST(ArrayList<Integer> inorder, int start, int end) {
        if (start > end) return null;

        int mid = (start + end) / 2;
        Node node = new Node(inorder.get(mid));
        node.left = createBST(inorder, start, mid - 1);
        node.right = createBST(inorder, mid + 1, end);
        return node;
    }
    public static Node blancsBST(Node root){  // --- O(n)
        // inorder swq  --- // O(n)
        ArrayList<Integer> inorder =new ArrayList<>();
        getInOrder(root, inorder);
        

        // CreateBST  ---- // O(n)
        root=createBST(inorder, 0,inorder.size()-1 );
        return root;
    }

    /// ============= MAIN =====================

    public static void main(String[] args) {
        
        Node root =new Node (8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);


        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        root=blancsBST(root);
        preorder(root);
    }
}
