// Validate BST
// Approach 1
// Compare with left & right node 
import java.util.*;
public class ValidateBST {
    static class Node {
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data= data;
        }
    }
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static boolean search(Node root, int key){
        if(root== null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left, key);
        }
        else {
            return search(root.right, key);
        }
    }

    /// ======== DELETE =========
    public static Node delete(Node root, int val){
        if (root == null) return null;
        if(root.data < val){
            root.right = delete(root.right, val); // fix: assign back to root.right
        }
        else if(root.data > val){
            root.left = delete(root.left, val); // fix: assign back to root.left
        }
        else {
            // Node to delete found
            if(root.left == null && root.right == null){
                return null;
            }
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            } else {
                Node IS = findInorderSuccessor(root.right);
                root.data = IS.data;
                root.right = delete(root.right, IS.data);
            }
        }
        return root;
    }
/// ============= findInorderSuccessor =============
    public static Node findInorderSuccessor(Node root){
        while (root.left != null) { // fix: loop to leftmost
            root = root.left;
        }
        return root;
    }
//========== Inorder ===========
    public static void inorder(Node root){
        if(root== null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //======= Print in Range =============
    public static void Range (Node root, int k1, int k2){
        if(root== null) return ;

        if(root.data>=k1  && root.data<=k2){
            Range(root.left, k1, k2);
            System.out.print(root.data+" ");
            Range(root.right, k1, k2);
        } else if(root.data<k1){
            Range(root.left, k1, k2);
        } else {
            Range(root.right, k1, k2);
        }
    }
    // =============== Root To Leaf Path  ( PrintPath ) ===================
    public static void PrintPath(ArrayList<Integer> path){
        for(int i=0; i<path.size();i++){
            System.out.print(path.get(i)+"-> ");
        }
        System.out.println();
    }

    // ============= Root To Leaf Path ==========

    public static void rootLeafpath(Node root, ArrayList<Integer> path ){
        if(root==null) return;

        path.add(root.data);

        if(root.left==null && root.right==null) PrintPath(path);
        
        rootLeafpath(root.left, path);
        rootLeafpath(root.right, path);
        path.remove(path.size()-1);
    }

    //=============VALID BST ==========================

    public static boolean isvalidBST(Node root, Node min, Node max){
        if (root==null) {
            return  true;
        }
        if(min != null && root.data<=min.data){
            return false;
        }
        if (max != null && root.data>=max.data) {
            return false;
        }
        return isvalidBST(root.left, min,root) && isvalidBST(root.right,root,max) ;
    }

    //======== Main =================

    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        
        Node root= null;
        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }  
        inorder(root);
        System.out.println();

        // root=delete(root, 1);
        // System.out.println();
        
        // inorder(root);

       // Range(root, 5, 12);

        //rootLeafpath(root, new ArrayList<>());

        if (isvalidBST(root, null, null)) {
            System.out.println("Valid BST...");
        } else {
            System.out.println("NOT Valid BST...");
        }
    }
}
