/// ============ MIRROR A BST ===================

public class MirrorBST {
    static class Node {
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data= data;
        }
    }
    
    public static Node createMirror(Node root){
        if(root == null) return null;

        Node leftMirror=createMirror(root.left);
        Node rightMirror=createMirror(root.right);

        root.left=rightMirror;
        root.right=leftMirror;
        return root;
    }

    public static void preoder(Node root){
        if(root== null ) return ;

        System.out.print(root.data+" ");
        preoder(root.left);
        preoder(root.right);
    }

    //======== Main =================

    public static void main(String[] args) {
        //     8
        //    / \
        //   5  10
        //  / \   \
        // 3   6   11

        Node root = new Node (8);
        root.left= new Node (5);
        root.right= new Node (10);
        root.left.left= new Node (3);
        root.left.right= new Node (6);
        root.right.right= new Node (11);
        
        //     8
        //    / \
        //   10  5
        //  / \   \
        // 11   6   3
        //  Mirror BST


        root=createMirror(root);
        preoder(root);

    }
}
