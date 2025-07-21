

public class AVLtree {
    static class Node {
        int data;
        int height;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            height = 1; // Initial height of a new node is 1
        }
    }

    static Node root; // Declaring root node globally

    // Function to get the height of a node
    public static int height(Node root) {
        if (root == null) return 0;
        return root.height;
    }

    // Function to perform right rotation
    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        // Return new root
        return x;
    }

    // Function to perform left rotation
    public static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        // Return new root
        return y;
    }

    // Function to get balance factor of a node
    public static int getBalance(Node root) {
        if (root == null) return 0;
        return height(root.left) - height(root.right);
    }

    // Function to insert a node into the AVL tree
    public static Node insert(Node root, int key) {
        if (root == null) return new Node(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);
        else
            return root; // Duplicate keys are not allowed in AVL tree

        // Update height of this ancestor node
        root.height = 1 + Math.max(height(root.left), height(root.right));

        // Get the balance factor of this ancestor node to check for rotations
        int balance = getBalance(root);

        // Left Left Case
        if (balance > 1 && key < root.left.data)
            return rightRotate(root);

        // Right Right Case
        if (balance < -1 && key > root.right.data)
            return leftRotate(root);

        // Left Right Case
        if (balance > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // Right Left Case
        if (balance < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        // Return the (unchanged) node pointer
        return root;
    }

    // Function to perform preorder traversal of the AVL tree
    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        root = null; // Initialize root as null initially

        // Inserting nodes into AVL tree
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25); // Example of a case that requires rotation

        // Printing preorder traversal of AVL tree
        System.out.println("Preorder traversal of AVL tree:");
        preorder(root);
    }
}
