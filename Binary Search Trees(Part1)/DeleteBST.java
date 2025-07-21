
// public class DeleteBST {
// 	static class Node {
//         int data;
//         Node left;
//         Node right;
        
//         Node(int data){
//             this.data= data;
//         }
        
//     }
//     ///========== Insert =============
//     public static Node insert(Node root, int val) {
//         if (root == null) {
//             root = new Node(val);
//             return root;
//         }
//         if (val < root.data) {
//             root.left = insert(root.left, val);
//         } else {
//             root.right = insert(root.right, val);
//         }
//         return root;
//     }
// // =============== Search =====================
//     public static boolean search(Node root, int key){
//         if(root== null){
//             return false;
//         }
//         if(root.data==key){
//             return true;
//         }
//         if(root.data>key){
//             return search(root.left, key);
//         }
//         else {
//             return search(root.right, key);
//         }
//     }

//     /// ======== DETETE =========
//     public static Node delete(Node root, int val){
//         if(root==null) {
//             return null;
//         }
//         if(root.data<val){
//             return delete(root.right, val);
//         }
//         else if(root.data>val){
//             return delete(root.left, val);
//         }
//         else {
//             // Voila
//             if(root.left==null && root.right== null){
//                 return null;
//             }

//             if(root.left==null){
//                 return root.right;
//             }
//             else if(root.right==null){
//                 return root.left;
//             } else {
//                 Node IS =findInorderSuccessor(root.right);
//                 root.data=IS.data;
//                 root.right=delete(root.right, IS.data);
//             }
//             return root;
//         }
//     }
// /// ============= findInorderSuccessor =============
//     public static Node findInorderSuccessor(Node root){
//         while(root.left != null) {
//             root = root.left;
//         }
//         return root;
//     }
// //========== Inorder ===========
//     public static void inorder(Node root){
//         if(root== null){
//             return;
//         }
//         inorder(root.left);
//         System.out.print(root.data+" ");
//         inorder(root.right);
//     }

//     public static void main(String[] args) {
//         int values[]={8,5,3,1,4,6,10,11,14};
        
//         Node root= null;
//         for(int i=0;i<values.length;i++){
//             root=insert(root, values[i]);
//         } 
//         inorder(root);
//         System.out.println();

//         root=delete(root, 1);
//         System.out.println();
        
//         inorder(root);
    
//     }
// }



public class DeleteBST {
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

    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        
        Node root= null;
        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        } 
        inorder(root);
        System.out.println();

        root=delete(root, 1);
        System.out.println();
        
        inorder(root);
    }
}