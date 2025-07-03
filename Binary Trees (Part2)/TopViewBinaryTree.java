import java.util.*;
public class TopViewBinaryTree {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    static class Info{
        Node node;
        int ht;        // Horizontal 

        public Info(Node node,int ht){
            this.node=node;
            this.ht=ht;
        }
    }
    public static void topview(Node root){

        Queue<Info> q = new LinkedList<>();
        Map<Integer, Node> map = new HashMap<>();

        int minht=0, maxh=0;
        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if(curr== null){
                if(q.isEmpty()){
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if(!map.containsKey(curr.ht)){
                    map.put(curr.ht, curr.node);

                }
                if(curr.node.left != null){
                    q.add(new Info(curr.node.left, curr.ht-1));
                    minht= Math.min(minht, curr.ht-1);
                }
                if(curr.node.right != null){
                    q.add(new Info(curr.node.right, curr.ht+1));
                    maxh= Math.max(maxh, curr.ht+1);
                }
            }
            
        }
        for(int i=minht; i<=maxh;i++){
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        // Example usage

        //     1
        //    / \   
        //   2   3
        //  / \  / \
        // 4   5 4   6


        // Create the binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Top view of the binary tree:");
        topview(root);
    }
    
}
